import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class LogoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    // Draw sun
                    g2d.setColor(Color.ORANGE);
                    g2d.fillOval(100, 50, 200, 200);

                    g2d.setColor(Color.lightGray);
                    g2d.setStroke(new BasicStroke(10));
                    g2d.drawArc(80, 140, 250, 50, -210, 246);
                    g2d.setColor(Color.BLACK);
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 60));
                    g2d.drawString("HRD", 140, 155);

                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}