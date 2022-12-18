package ITProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BasicDiac extends JPanel{
    BasicDiac(int width, int height, String url, String str) {

        setPreferredSize(new Dimension(400, 400));
        setBackground(new Color(253, 251, 251));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panel_for_picture = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel_for_picture.setOpaque(false);
        panel_for_picture.setPreferredSize(new Dimension(350, 350));

        try {
            URL u = new URL(url);
            BufferedImage img = ImageIO.read(u);
            Image scaleImage = img.getScaledInstance(650, 350,Image.SCALE_DEFAULT);
            JLabel picture = new JLabel(new ImageIcon(scaleImage));
            panel_for_picture.add(picture);
            add(panel_for_picture);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JPanel panel_for_label = new JPanel(new FlowLayout(FlowLayout.CENTER));    // панелька для цены
        panel_for_label.setOpaque(false);
        JLabel label = new JLabel();       // лейбл акции
        label.setText("ловкптцщ");
        Font newFont = new Font("Serif", Font.ITALIC, 25);
        label.setFont(newFont);
        panel_for_label.add(label);
        add(panel_for_label);

        setVisible(true);
    }
}
