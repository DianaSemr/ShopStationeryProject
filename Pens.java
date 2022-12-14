package ITProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Pens extends JPanel {

    JPanel panel = new JPanel();

    //JLabel label = new JLabel("Picture", new ImageIcon("https://sun9-35.userapi.com/impg/egG_d6sY1rHwpeEj_KNaHU6nwIpQxjbdKP3KKQ/PkXEw_Blyhw.jpg?size=320x320&quality=96&sign=f1cc911db57bd6b96a861ca959c2cf95&type=album"), JLabel.CENTER);
    //JLabel label1 = new JLabel("Метка");

    public Pens() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        panel.setLayout(new GridLayout(3, 3));

        setBackground(new Color(180, 142, 196));
        //panel.setLocation(0, 0);
        //panel.setSize(getWidth(), getHeight());
        panel.setBackground(new Color(0, 0, 0));

        panel.setLayout(new GridLayout(2, 0, 5, 12));

        for (int i = 0; i < 8; i++) {
            panel.add(new JButton("Кнопка " + i));
        }

        add(panel);

        setVisible(true);
    }


}

    /*@Override
    protected void paintStationery(java.awt.Graphics g) {

        Graphics2D g1 = (Graphics2D) g;
        try {
            URL url = new URL("https://img.freepik.com/free-photo/boxes-with-gifts-christmas-decorations-blue-surface_127032-2004.jpg?w=996&t=st=1670335922~exp=1670336522~hmac=1e26e0ccb14772b6359335486c396b43536f1dfdb180772b575e00ffe490dd87");
            BufferedImage img = ImageIO.read(url);
            g1.drawImage(img, 1, 1, this);
            //URL url2 = new URL("https://sun9-35.userapi.com/impg/egG_d6sY1rHwpeEj_KNaHU6nwIpQxjbdKP3KKQ/PkXEw_Blyhw.jpg?size=320x320&quality=96&sign=f1cc911db57bd6b96a861ca959c2cf95&type=album");
            URL url2 = new URL("https://s3.ibta.ru/goods/143299/172d96ca751fe8b5fd63eed0f822f5cc_x.jpg");
            BufferedImage img2 = ImageIO.read(url2);
            Image scaleImage = img2.getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            g1.drawImage(scaleImage, 100, 100, this);
           // g1.setPaint(new Color(0xB00606));
           // Font newFont = new Font("Serif", Font.ITALIC, 45);
            //setFont(newFont);
            //g1.drawString("Welcome To The Login Screen", 200, 140);

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getButtonName() {
        return "Ручки";
    }
}*/
