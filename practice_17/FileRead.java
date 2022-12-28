import java.io.*;

public class FileRead {
    public static void main(String[] args) throws Exception {
        try (BufferedReader in = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}