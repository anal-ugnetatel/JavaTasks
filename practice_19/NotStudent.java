public class NotStudent extends Exception {
    public NotStudent(String name) {
        super("студент с ФИО "+ name + " не найден");
    }
}