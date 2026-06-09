import javax.swing.*;
import java.awt.*;

public class three extends JPanel {

    int x = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, 50, 30, 30);
    }

    public void moveCircle() {
        Timer timer = new Timer(30, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        });
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Demo");
        three panel = new three();
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.moveCircle();
    }
}
