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

    Animation(int x, int y, String url, int width)
    {
        try {
            JPanel panel_for_gif = new JPanel();
            //panel_for_gif.setBounds(0,0,getWidth(), 80);

            URL u = new URL(url);

            ImageIcon icon = new ImageIcon(u);
            icon.setImage(icon.getImage().getScaledInstance(600, width,Image.SCALE_DEFAULT));
            JLabel copyLabel = new JLabel(icon);
            copyLabel.setBackground(new Color(171, 236, 243));

            add(copyLabel);
            //panel_for_gif.add(copyLabel);
            //add(panel_for_gif);


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
