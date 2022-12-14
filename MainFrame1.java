package ITProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class MainFrame1 extends Stationery {
    @Override
    protected void paintStationery(Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        g1.setBackground(Color.BLACK);
        try {
            URL url = new URL("https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png");
        BufferedImage img = ImageIO.read(url);
        Image scaleImage = img.getScaledInstance(1000, 350,Image.SCALE_DEFAULT);
            g1.drawImage(scaleImage, 10, 10, this);
            g1.setPaint(new Color(0x050000));
            Font newFont = new Font("Serif", Font.ITALIC, 25);
            setFont(newFont);
            String a = "В Новый год происходит много чудес: даже цены замерли в ожидании волшебства. Скорее забирайте под ёлку яркие краски, забавные игрушки и праздничные украшения. \n";
            String b = "Специальные цены на выделенный ассортимент. Акция действует с 12 по 25 декабря в магазинах сети. ";
            g1.drawString(a, 30,380);

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public String getButtonName() {
        return "Главная";
    }
}

