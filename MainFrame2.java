package ITProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class MainFrame2 extends JPanel {
    MainFrame2()
    {
        this.setBackground(new Color(0xF7F7FC));
        try {
            URL url = new URL("https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png");
            BufferedImage img = ImageIO.read(url);
            Image scaleImage = img.getScaledInstance(1000, 350,Image.SCALE_DEFAULT);
            JLabel picLabel = new JLabel(new ImageIcon(scaleImage));
            add(picLabel);
            Font newFont = new Font("Serif", Font.ITALIC, 25);
            setFont(newFont);
            JLabel s = new JLabel("В Новый год происходит много чудес: \n даже цены замерли в ожидании волшебства.");
            String a = "В Новый год происходит много чудес: даже цены замерли в ожидании волшебства. Скорее забирайте под ёлку яркие краски, забавные игрушки и праздничные украшения. \n";
            String b = "Специальные цены на выделенный ассортимент. Акция действует с 12 по 25 декабря в магазинах сети. ";
            add(s);
            s.setFont(newFont);
            //g1.drawString(a, 30,380);

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
