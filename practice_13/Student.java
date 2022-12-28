public class Student implements Comparable<Student> {

    private int idNum;
    private int GPA;

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "idNum=" + idNum + ", GPA=" + GPA + '}';
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return this.idNum - o.idNum;
    }
}