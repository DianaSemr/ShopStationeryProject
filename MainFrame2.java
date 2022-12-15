package ITProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class MainFrame2 extends Stationery {
    MainFrame2()
    {
        this.setBackground(new Color(0xF7F7FC));
        try {
            File input = new File("C:\\Users\\Диана\\IdeaProjects\\MainFrame1.png");
            BufferedImage img = ImageIO.read(input);
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
    MainFrame2(String string) throws IOException {
        if(Objects.equals(string, "0"))
        {
            this.setBackground(new Color(0xF7F7FC));
            try {
                File input = new File("C:\\Users\\Диана\\IdeaProjects\\MainFrame1.png");
                BufferedImage img = ImageIO.read(input);
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
        else if(Objects.equals(string, "1"))
        {

            URL url2 = new URL("https://www.wunderbarebilder.de/wp-content/uploads/2019/12/advent-kalender.png");
            BufferedImage img2 = ImageIO.read(url2);
            JLabel picLabel = new JLabel(new ImageIcon(img2));
            add(picLabel);
        }
    }

    @Override
    protected void paintStationery(Graphics g) {

    }

    @Override
    public String getButtonName() {
        return null;
    }
}
