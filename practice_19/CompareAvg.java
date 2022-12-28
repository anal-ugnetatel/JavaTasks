import java.util.Comparator;

public class CompareAvg implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAvgPoint() - o2.getAvgPoint();
    }
}