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
                URL url = new URL("https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png");
                BufferedImage img = ImageIO.read(url);
                Image scaleImage = img.getScaledInstance(1000, 350,Image.SCALE_DEFAULT);
                JLabel picLabel = new JLabel(new ImageIcon(scaleImage));
                add(picLabel);
                Font newFont = new Font("Serif", Font.ITALIC, 23);
                setFont(newFont);
                String []s2 = new String[7];
                s2[0] = "В Новый год происходит много чудес: \n даже цены замерли в ожидании волшебства.";
                s2[1] = " Скорее забирайте под ёлку яркие краски, забавные игрушки и праздничные украшения. \n";
                s2[2] = "Специальные цены только на выделенный ассортимент.";
                s2[3] = "Акция действует с 12 по 25 декабря в магазинах сети.";

                for(int i = 0; i < 4; i++)
                {
                    JLabel d = new JLabel(s2[i]);
                    d.setLocation(15, 420 + 10 * i);
                    d.setFont(newFont);
                    add(d);
                }
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
        else if(Objects.equals(string, "2"))
        {
            LayoutManager overlay = new OverlayLayout(this);
            setLayout(overlay);

            Font newFont = new Font("Serif", Font.BOLD, 23);
            JLabel s = new JLabel("Новинка в магазине!");
            s.setFont(newFont);
            s.setLocation(100, 70);
            add(s);
            //s.setAlignmentX(0.1f);
            //s.setAlignmentY(0.1f);
            JLabel s2 = new JLabel("Теперь можно приобрести краски для граффити");
            s2.setFont(newFont);
            //s2.setLocation(500, 470);
            add(s2);
            s2.setAlignmentX(0.1f);
            s2.setAlignmentY(0.1f);
            URL url2 = new URL("https://catherineasquithgallery.com/uploads/posts/2021-02/1614534916_179-p-kraski-na-belom-fone-237.jpg");
            BufferedImage img = ImageIO.read(url2);
            Image scaleImage = img.getScaledInstance(1025, 580,Image.SCALE_DEFAULT);
            JLabel picLabel = new JLabel(new ImageIcon(scaleImage));
            add(picLabel);
            picLabel.setAlignmentX(0.1f);
            picLabel.setAlignmentY(0.1f);
        }
        else if(Objects.equals(string, "3"))
        {
            setLayout(new BorderLayout());
            add(new Discounts());
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
