import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
public class App extends JFrame {
    JFrame jf = new JFrame("GameGuess");
    JTextField source = new JTextField();
    int attempt = 3;
    int random = 1+(int)(Math.random()*20);
    boolean win = false;

    App() {

        jf.setSize(600, 300);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(4, 1));
        System.out.println("ответ: " + random);
        source.addActionListener(e -> {

            System.out.println("попыток: " + --attempt);
            if(Integer.parseInt(source.getText()) < random){
                JOptionPane.showMessageDialog(App.this,
                        "введенное число меньше ответа"); }
            if(Integer.parseInt(source.getText()) > random){
                JOptionPane.showMessageDialog(App.this,
                        "введенное число больше ответа"); }
            if(Integer.parseInt(source.getText()) == random){
                win = true;
                JOptionPane.showMessageDialog(App.this,
                        "ура победа"); }
            if (win || attempt == 0) {
                if (win) {
                    JOptionPane.showMessageDialog(App.this,
                            "вы победили, игра окончена");
                    jf.dispatchEvent(new WindowEvent(jf, WindowEvent.WINDOW_CLOSING));
                }
                else {
                    JOptionPane.showMessageDialog(App.this,
                            "вы проиграли израсходовав все попытки, игра окончена");
                    jf.dispatchEvent(new WindowEvent(jf, WindowEvent.WINDOW_CLOSING));
                }
            }
        });
        jf.add(source);
        jf.setVisible(true);
        JOptionPane.showMessageDialog(null,
                "игра началась, угадайте число от 1 до 21");
    }
}