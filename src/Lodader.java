import javax.swing.*;
import java.awt.*;

public class Lodader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("My first Windows applictiton");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println("some text");
    }
}
