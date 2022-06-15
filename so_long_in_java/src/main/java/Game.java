import javax.swing.*;

public class Game {
    private static void initWindow() {
        JFrame frame = new JFrame("./so_long.jar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        initWindow();
    }
}
