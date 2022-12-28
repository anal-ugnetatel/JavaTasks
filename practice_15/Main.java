public class Main {
    public static void main(String[] args) {
        MyArrayList<Student> arr = new MyArrayList<>(Student.class, 50);
        arr.add(new Student("fio", 4, 12));
        arr.add(new Student("fio1", 5, 21));
        arr.add(new Student("fio2", 8, 31));
        arr.add(new Student("fio3", 1, 12));
        arr.add(new Student("b", 3, 4));

        System.out.println(arr);

        System.out.println("Значение второго элемента: " + arr.get(1));

        arr.set(2,new Student("fio4", 3, 21));
        System.out.println("Установка студента fio4 на место третьего элемнета:\n" + arr);

    }
}
