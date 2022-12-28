//25 s expression
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class IPtesting {


    private static String S;
    private static boolean bool;


    private static final String IPADDRESS_PATTERN =
            new StringBuilder().append("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.")
                    .append("([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.")
                    .append("([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.")
                    .append("([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").toString();



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        S=s.next();
        bool = validate(S);
        if(bool) {
            System.out.println("Строка является IP адресом");
        }
        else {
            System.out.println("Строка НЕ является IP адресом");
        }



    }
    public static boolean validate( String ip){
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}