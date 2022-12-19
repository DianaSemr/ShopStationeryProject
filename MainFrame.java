package ITProject;
import org.w3c.dom.Text;

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
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MainFrame extends Stationery {
    MainFrame() {
        setLayout(null);
        this.setBackground(new Color(0xF7F7FC));
        try {
            //Создание первой кнопки, два варианта: через url и через файлы
            //File input = new File("C:\\Users\\Диана\\IdeaProjects\\MainFrame1.png");//определяю файл
            //BufferedImage img3 = ImageIO.read(input);//загружаю картинку
            JButton button = new JButton();// создаю кнопку
            button.setSize(750, 350);//задаю размер
            button.setLocation(15 , 10);//задаю местоположение
            //через URL
            URL url = new URL("https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png");
            BufferedImage img = ImageIO.read(url);
            Image scaleImage = img.getScaledInstance(750, 350,Image.SCALE_DEFAULT);//задаю размеры изображения
            button.setIcon(new ImageIcon(scaleImage));//устанавливаю картинку на кнопку
            add(button);//добавляю кнопку
            button.addActionListener(new Action2(new MainFrame2("0")));//добавляю действие к кнопке

            //File input2 = new File("C:\\Users\\Диана\\IdeaProjects\\MainFrame2.jpg");
            //BufferedImage img4 = ImageIO.read(input2);
            JButton button2 = new JButton();
            button2.setSize(235, 350);
            button2.setLocation(775 , 10);
            URL url2 = new URL("https://www.wunderbarebilder.de/wp-content/uploads/2019/12/advent-kalender.png");
            BufferedImage img2 = ImageIO.read(url2);
            Image scaleImage2 = img2.getScaledInstance(235, 350,Image.SCALE_DEFAULT);
            button2.setIcon(new ImageIcon(scaleImage2));
            add(button2);
            button2.addActionListener(new Action2(new MainFrame2("1")));


            //File input3 = new File("C:\\Users\\Диана\\IdeaProjects\\MainFrame1.png");
            //BufferedImage img = ImageIO.read(input3);
            JButton button3 = new JButton();// Добавляю кнопку для "акций"
            button3.setSize(300, 150);
            button3.setLocation(15 , 385);
            URL url3 = new URL("https://avatars.mds.yandex.net/i?id=7ec3f491fa15ced2406e3db8e056caebe4d93ec8-6332308-images-thumbs&n=13");
            BufferedImage img5 = ImageIO.read(url3);
            Image scaleImage4 = img5.getScaledInstance(300, 150,Image.SCALE_DEFAULT);
            button3.setIcon(new ImageIcon(scaleImage4));
            add(button3);
            button3.addActionListener(new Action2(new MainFrame2("2")));


            JButton button4 = new JButton();// Добавляю кнопку для "акций"
            button4.setSize(300, 150);
            button4.setLocation(345 , 385);
            URL url4 = new URL("https://static.tildacdn.com/tild6562-6231-4438-b837-386431663239/photo.jpg");
            BufferedImage img6 = ImageIO.read(url4);
            Image scaleImage6 = img6.getScaledInstance(300, 150,Image.SCALE_DEFAULT);
            button4.setIcon(new ImageIcon(scaleImage6));
            add(button4);
            button4.addActionListener(new Action2(new MainFrame2("3")));


            Font newFont = new Font("Serif", Font.ITALIC, 35);
            JButton button5 = new JButton("Информация");
            button5.setFont(newFont);
            button5.setSize(325, 150);
            button5.setLocation(680 , 385);
            button5.setBackground(new Color(0xC5C5F1));
            add(button5);
            button4.addActionListener(new Action2(new MainFrame2("4")));
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
    public class Action2 implements ActionListener {//Определяем действия
        Stationery s;
        Action2(Stationery st) throws IOException {
            s = st;//задаю тип в зависимости от нажатой кнопки, string - номер кнопки
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

