import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlanetsGUI extends JFrame implements ActionListener {

    JComboBox comboBox;
    JLabel label, label2;

    PlanetsGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        ArrayList<String> arr = new ArrayList<>();
        for (MainInfo task : MainInfo.values()) {
            arr.add(task.name());
        }
        String[] array = arr.toArray(new String[0]);

        comboBox = new JComboBox(array);
        label = new JLabel();
        label2 = new JLabel();

        this.add(label);
        this.add(label2);
        this.pack();
        this.setSize(600, 300);
        this.setVisible(true);
        comboBox.addActionListener(this);
        this.add(comboBox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            for (MainInfo task : MainInfo.values()) {
                if (msg != null && msg.equals(task.name())) {
                    label.setText(task.toString());
                }
            }
            for (Menu task2 : Menu.values()) {
                if (msg != null && msg.equals(task2.name())) {
                    label2.setText(task2.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        new PlanetsGUI();
    }
}