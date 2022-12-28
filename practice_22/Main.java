import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
//22.2
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hours then minutes to form date");
        Calendar c1 = Calendar.getInstance();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        Date d = new Date(c1.get(Calendar.YEAR) - 1900, c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH), hours, minutes);
        System.out.println(d);

        Calendar c2 = new GregorianCalendar();
        System.out.println("enter year then month then day to form date");
        int year = scanner.nextInt();
        c2.set(Calendar.YEAR, year);
        int month = scanner.nextInt();
        c2.set(Calendar.MONTH, month - 1);
        int day = scanner.nextInt();
        c2.set(Calendar.DAY_OF_MONTH, day);
        c2.set(Calendar.HOUR_OF_DAY, 0);
        c2.set(Calendar.MINUTE, 0);
        c2.set(Calendar.SECOND, 0);
        Date date = c2.getTime();
        System.out.println(date);
    }
}