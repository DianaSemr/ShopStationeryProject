package ITProject;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;

public class MainFrame extends Stationery {
    MainFrame() {
        setLayout(null);
        this.setBackground(new Color(0xF7F7FC));
        try {
            JButton button = new JButton();// Добавляю кнопку для "акций"
            button.setSize(750, 350);
            button.setLocation(15 , 10);
            URL url = new URL("https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png");
            BufferedImage img = ImageIO.read(url);
            Image scaleImage = img.getScaledInstance(750, 350,Image.SCALE_DEFAULT);
            button.setIcon(new ImageIcon(scaleImage));
            add(button);
            button.addActionListener(new Action2(new MainFrame1()));

            JButton button2 = new JButton();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintStationery(Graphics g) {

    }

    @Override
    public String getButtonName() {
        return "Главная";
    }
    public class Action2 implements ActionListener {
        Stationery s;
        Action2(Stationery st)
        {
            s = st;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //paint(new MainFrame1()); // отрисовка
            //remove(currentPanel)// замена панели
            removeAll();
            //panel1 = new MainFrame2();
            setLayout(new BorderLayout());
            add(s);
            revalidate();
            repaint();

        }
}
}

