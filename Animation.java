package ITProject;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Animation extends JApplet {

    Animation(int x, int y, String url)
    {
        try {
            URL u = new URL(url);

            ImageIcon icon = new ImageIcon(u);
            JLabel copyLabel = new JLabel(icon);
            copyLabel.setBackground(new Color(171, 236, 243));
            //copyLabel.setOpaque(false);

            add(copyLabel);


            /*BufferedImage img = ImageIO.read(u);
            Image scaleImage = img.getScaledInstance(571, 84,Image.SCALE_DEFAULT);
            //JLabel picture = new JLabel(new ImageIcon(scaleImage));
            JLabel picture = new JLabel((Icon) img);
            picture.setOpaque(false);
            add(picture);*/


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
