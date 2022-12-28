import java.util.ArrayList;
//19
public class Addon {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 67, 2));
        s.add(new Student("ФИО2", 57, 12));
        s.add(new Student("ФИО3", 93, 12));
        s.add(new Student("ФИО4", 24, 2));
        s.add(new Student("ФИО5", 66, 12));

        new LabClassUI(s);
    }

}