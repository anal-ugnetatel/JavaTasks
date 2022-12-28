import java.util.ArrayList;

//13
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(220, 4));
        students.add(new Student(140, 5));
        students.add(new Student(189, 8));
        students.add(new Student(120, 1));

        System.out.println("initial");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("sorted by id");
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i - 1;
            for (; j >= 0 && current.compareTo(students.get(j)) < 0; j--) {
                students.set(j + 1, students.get(j));
            }
            students.set(j + 1, current);
        }
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("sorted by GPA");
        qSort(students, students.size() - 1, 0);
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        // merge sort
        System.out.println("new by id");
        ArrayList<Student> students2 = new ArrayList<Student>();


        students.add(new Student(350, 4));
        students.add(new Student(160, 1));
        students.add(new Student(180, 7));
        students.add(new Student(222, 2));

        ArrayList<Student> allStudents = new ArrayList<>();

        allStudents.addAll(students);
        allStudents.addAll(students2);

        mergeSort(allStudents, allStudents.size());
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }
    ///

    ///
    public static void mergeSort(ArrayList<Student> a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;



        ArrayList<Student> l = new ArrayList<>(a.subList(0, mid));
        ArrayList<Student> r = new ArrayList<>(a.subList(mid, a.size()));

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).compareTo(r.get(j)) <= 0) {
                a.set(k++, l.get(i++));
            } else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }


    private static StudentComp comp = new StudentComp();

    public static void qSort(ArrayList<Student> students, int high, int low) {
        if (students == null || students.size() == 0) return;
        if (high <= low) return;

        Student middle = students.get((low + high) / 2);
        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        ArrayList<Student> eq = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (comp.compare(students.get(i), middle) > 0) {
                right.add(students.get(i));
            } else if (comp.compare(students.get(i), middle) < 0) left.add(students.get(i));
            else eq.add(students.get(i));
        }
        ArrayList<Student> leftArr;
        ArrayList<Student> rightArr;
        if (left.size() > 0) {
            leftArr = left;
            qSort(leftArr, left.size() - 1, 0);
            students.addAll(leftArr);
        }
        students.addAll(eq);

        if (right.size() > 0) {
            rightArr = right;
            qSort(rightArr, right.size() - 1, 0);
            students.addAll(rightArr);
        }

    }
}