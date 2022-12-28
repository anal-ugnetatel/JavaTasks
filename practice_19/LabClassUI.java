import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {

    private final ArrayList<Student> students;
    private final JTable studTable;

    public LabClassUI(ArrayList<Student> students){
        // base
        super("Ноябрь");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 720);
        setLocationRelativeTo(null);

        this.students = students;

        // Btns
        JPanel pN = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("добавить");
        JButton remStudentBtn = new JButton("удалить");
        JButton findStudentBtn = new JButton("найти");

        pN.add(addStudentBtn);
        pN.add(remStudentBtn);
        pN.add(findStudentBtn);

        addStudentBtn.addActionListener(e -> {
            try {
                addBtnClicked();
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        remStudentBtn.addActionListener(e-> remBtnClicked());

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (NotStudent ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        // JTable
        Object[] headers = new String[] {"ФИО",  "Группа", "Средний балл"};
        Object [][] startStudents = new String[students.size()][3];
        for(int i = 0; i < students.size(); i++){
            startStudents[i][0] = students.get(i).getFio();

            startStudents[i][1] = ((Integer)(students.get(i).getGroupNum())).toString();
            startStudents[i][2] = ((Integer)(students.get(i).getAvgPoint())).toString();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);


        header.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int count = e.getClickCount();
                if (count == 2){
                    if(header.getHeaderRect(0).contains(e.getX(), e.getY()))
                        sortStudents(Student::compareTo);


                    if(header.getHeaderRect(1).contains(e.getX(), e.getY()))
                        sortStudents(Student.GROUP_COMP);
                    if(header.getHeaderRect(2).contains(e.getX(), e.getY()))
                        sortStudents(Student.AVG_COMP);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }

    private void sortStudents(Comparator<Student> comp) {
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getFio(),  st.getGroupNum(), st.getAvgPoint()});
        }
    }

    private void findBtnClicked() throws NotStudent {
        String s = JOptionPane.showInputDialog("поиск по ФИО");
        for (Student student : students) {
            if (student.getFio().equals(s)) {
                JOptionPane.showMessageDialog(this, "найдено: " +
                        student);
                return;
            }
        }
        throw new NotStudent(s);
    }

    private void remBtnClicked() {
        int c = studTable.getSelectedRowCount();
        if(c != 1) {
            JOptionPane.showMessageDialog(this, "выберете строку");
            return;
        }
        c = studTable.getSelectedRow();
        students.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.removeRow(c);

    }

    private void addBtnClicked() throws IllegalArgumentException {
        String fio = JOptionPane.showInputDialog("введите фио");
        if(fio.equals("")) throw new EmptyString();

        String group = JOptionPane.showInputDialog("введите номер группы");
        String avg = JOptionPane.showInputDialog("введите средний балл");

        int avgI;
        int groupI;

        try {
            avgI = Integer.parseInt(avg);
            groupI = Integer.parseInt(group);

        }catch (NumberFormatException e){
            throw new NumberFormatException("невозможно записать строку "+e.getMessage().substring(17) + " как число");
        }

        students.add(new Student(fio, avgI, groupI));

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.addRow(new Object[]{fio,  group, avg});
    }
}