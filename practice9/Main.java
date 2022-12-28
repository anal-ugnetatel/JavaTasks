import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
class Main extends JFrame {
    int WINDOW_WIDTH = 1080;
    int WINDOW_HEIGHT = 720;
    String backgroundImagePath;
    String animationImagesPath;
    int method;

    Main() {
        super("shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setBackground(Color.WHITE);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button btn = new Button("animation");
        btn.setSize(200, 50);
        btn.setLocation(0, 0);
        btn.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        method = 1;
                        setTitle("Animation");
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                    }
                }
        );
        add(btn);

        Button btn2 = new Button("one random shape");
        btn2.setSize(200, 50);
        btn2.setLocation(200, 0);
        btn2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        method = 2;
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                    }
                }
        );
        add(btn2);
    }

    void setBackgroundImagePath(String path) {
        this.backgroundImagePath = path;
    }
    void setAnimationImagesPath(String path) {
        this.animationImagesPath = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.backgroundImagePath);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                randomShapesPaint(20, g);
                break;
            case 1:
                animate(this.animationImagesPath, g);
                break;
            case 2:
                randomShapesPaint(1, g);
                break;
            default:
                break;
        }
    }

    void randomShapesPaint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 4);

            switch (choice) {
                // Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                // Rounded rect
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                // Circle
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100
                    );
                    break;
                default:
                    break;
            }
        }
    }
    void animate(String framesPath, Graphics2D g) {
        File dir = new File(framesPath);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] args) {
        Main app = new Main();
        if (args.length == 2) {
            app.setBackgroundImagePath(args[0]);
            app.setAnimationImagesPath(args[1]);
        }
        else {
            System.out.println("no paths in args!");
        }
    }
}
