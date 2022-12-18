package ITProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Buttons extends Stationery{

    public Buttons(String url, String str){

        //setPreferredSize(new Dimension(1025, 800));

        setLayout(null);

        /*JPanel panel_for_picture = new JPanel();
        panel_for_picture.setOpaque(false);
        panel_for_picture.setBounds(50, 50, 500, 500);

        try {
            URL u = new URL(url);
            BufferedImage img = ImageIO.read(u);
            Image scaleImage = img.getScaledInstance(350, 350,Image.SCALE_DEFAULT);
            JLabel picture = new JLabel(new ImageIcon(scaleImage));
            panel_for_picture.add(picture);
            add(panel_for_picture);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        JPanel panel_for_text = new JPanel();
        panel_for_text.setBackground(new Color(0,0,0));
        JLabel text = new JLabel();
        text.setText(str);
        Font newFont = new Font("Serif", Font.PLAIN, 25);
        text.setFont(newFont);
        panel_for_text.add(text);

        add(panel_for_text);
    }

    @Override
    protected void paintStationery(Graphics g) {

    }

    @Override
    public String getButtonName() {
        return null;
    }
}
