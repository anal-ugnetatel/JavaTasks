import java.io.*;
//17
public class Program {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("notes.txt", false))
        {

            String text = "test adding";
            writer.write(text);

            writer.append('\n');

            writer.append("more lines");

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}