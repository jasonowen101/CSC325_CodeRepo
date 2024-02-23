import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Logo2App {
    protected static final char[] A = null;
protected static final int B = 0;
protected static final int C = 0;

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
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);

                    // Draw sun rays
                    g2d.setColor(Color.BLUE);
                    for (int i = 0; i < 360; i += 45) {
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int) (Math.cos(radian) * 50);
                        int y1 = 100 + (int) (Math.sin(radian) * 50);
                        int x2 = 100 + (int) (Math.cos(radian) * 80);
                        int y2 = 100 + (int) (Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                    // Draw smiley face
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(80, 90, 40, 20, -180, 180);

                    // Draw Eyes on the Sun
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(90, 80, 5, 5); // Left eye
                    g2d.fillOval(105, 80, 5, 5); // Right eye

                    // Draw a square House to the bottom right of the sun
                    int houseWidth = 60;
                    int houseHeight = 60;
                    g2d.setColor(Color.ORANGE);
                    g2d.fillRect(250 - houseWidth, 250 - houseHeight, houseWidth, houseHeight); 

                    // Draw red door
                    int doorWidth = 20;
                    int doorHeight = 30;
                    g2d.setColor(Color.RED);
                    g2d.fillRect(230 - doorWidth, 250 - doorHeight, doorWidth, doorHeight); // Door
        
                    // Draw door outline
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(230 - doorWidth, 250 - doorHeight, doorWidth, doorHeight);

                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
