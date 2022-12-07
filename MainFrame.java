package ITProject;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;

public class MainFrame extends Stationery {
    @Override
    protected void paintStationery(Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        g1.setBackground(Color.BLACK);
        try {
            URL url = new URL("https://img.freepik.com/free-photo/boxes-with-gifts-christmas-decorations-blue-surface_127032-2004.jpg?w=996&t=st=1670335922~exp=1670336522~hmac=1e26e0ccb14772b6359335486c396b43536f1dfdb180772b575e00ffe490dd87");
            BufferedImage img = ImageIO.read(url);
            g1.drawImage(img, 1, 1, this);
            g1.setPaint(new Color(0xB00606));
            Font newFont = new Font("Serif", Font.ITALIC, 45);
            setFont(newFont);
            g1.drawString("Welcome To The Login Screen", 200, 140);

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public String getButtonName() {
        return "Главная";
    }
}

