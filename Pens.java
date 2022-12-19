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

public class Pens extends Stationery {

    //JPanel panel = new JPanel();

    //JLabel label = new JLabel("Picture", new ImageIcon("https://sun9-35.userapi.com/impg/egG_d6sY1rHwpeEj_KNaHU6nwIpQxjbdKP3KKQ/PkXEw_Blyhw.jpg?size=320x320&quality=96&sign=f1cc911db57bd6b96a861ca959c2cf95&type=album"), JLabel.CENTER);
    //JLabel label1 = new JLabel("Метка");

    public Pens() {

        JPanel all = new JPanel();   // общая панель
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
        //setBackground(new Color(171, 236, 243));
        setPreferredSize(new Dimension(getWidth(), 1900));


        JPanel panel_for_end = new JPanel();
        panel_for_end.setPreferredSize(new Dimension(50, 60));
        //panel_for_end.setBackground(new Color(0,0,0));
        panel_for_end.setOpaque(false);
        all.add(panel_for_end);


        Animation animation = new Animation(0, 0, "https://semyaivera.ru/wp-content/uploads/2016/01/Girlyanda-zhivaya.gif", 80);
        all.add(animation);

        JPanel panel_for_name = new JPanel(new FlowLayout(FlowLayout.CENTER));    // панелька для названя
        JLabel name = new JLabel();       // лейбл название
        name.setText("Ручки");
        Font newFont = new Font("Serif", Font.ITALIC, 70);
        name.setFont(newFont);

        panel_for_name.add(name);          // добавляем лейбл на панель с названием
        //panel_for_name.setBackground(new Color(29, 131, 246));

        name.setOpaque(false);
        panel_for_name.setOpaque(false);
        all.add(panel_for_name);        // добавляем панель с названием в общую панель

        all.add(panel_for_end);

        JPanel panel = new JPanel();       //  общая панель для картинок
        //panel.setSize(getWidth(), getHeight());

        //panel.setBounds(0,0,getWidth()-100,getHeight());/////////////////////////////////

        GridLayout grid = new GridLayout(3, 2, 50, 50);    //  панелька-табличка
        panel.setLayout(grid);
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/143300/c2da6b873cd8ca8a27e3359076dc8b83_xl.jpg", "27", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Длина сменного стержня — 140 мм.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Чернила на масляной основе — да.</p>"+"<p>Эргономичная зона захвата — рифление.</p>"+"<p>Цвет корпуса — прозрачный.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/140057/82f81d9873f12ab4f1203a4e745989b3_l.jpg", "15", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Одноразовая — да.</p>"+"<p>Толщина линии письма — 0.3 мм.</p>"+"<p>Серия — Orange.</p>"+"<p>Цвет корпуса — оранжевый.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Производитель — Франция.</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/143227/7a7077ea65b238f4b7670c01475b5084_l.jpg", "30", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Одноразовая — да.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Цвет корпуса — синий.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/143562/57c62c06436dd03ca0e12cf59279bde6_l.jpg", "17", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Длина сменного стержня — 140 мм.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Эргономичная зона захвата — рифление.</p>"+"<p>Цвет корпуса — оранжевый.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/143444/c4963ab41f85604e9d22eb59c1d907ed_l.jpg", "49", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Длина сменного стержня — 140 мм.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Эргономичная зона захвата — рифление.</p>"+"<p>Цвет корпуса — прозрачный.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/141634/4c7616f351438e830c9062d94e34eb4d_xl.jpg", "24","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Длина сменного стержня — 140 мм.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Форма наконечника — игольчатый.</p>"+"<p>Эргономичная зона захвата — рифление.</p>"+"<p>Цвет корпуса — синий.</p>"+"<p>Форма корпуса — круглая.</p>"+"<p>Производитель — Китай.</p>"+"</html>");


        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);

        /*for (int i = 0; i < 6; i++) {
            JPanel picture = new JPanel();    //  одна клеточка
            picture.setPreferredSize(new Dimension(400, 400));
            picture.setBackground(new Color(243, 236, 236));
            panel.add(picture);    // добавляем клеточку на панель для картинок

        }*/

        panel.setOpaque(false);
        all.add(panel);

        all.add(panel_for_end);

        Animation animation2 = new Animation(0, 0, "https://content.foto.my.mail.ru/mail/kasiyanenko46/_blogs/i-14877.gif", 320);
        all.add(animation2);

        all.setOpaque(false);
        add(all);

        setVisible(true);
    }

    @Override
    protected void paintStationery(java.awt.Graphics g) {

        Graphics2D g1 = (Graphics2D) g;
        try {
            /*URL url = new URL("https://img.freepik.com/free-vector/doodle-school-stationery-seamless-pattern-design_107791-9605.jpg?w=740&t=st=1671291861~exp=1671292461~hmac=03a748e7b922589c52f05773c3a5fe0c9a086ca84f9867a2b93890b9660d153b");
            BufferedImage img = ImageIO.read(url);
            Image scaleImage = img.getScaledInstance(1025, 800,Image.SCALE_DEFAULT);
            g1.drawImage(scaleImage, 0, 0, this);*/

            /*URL url = new URL("https://img.freepik.com/free-photo/boxes-with-gifts-christmas-decorations-blue-surface_127032-2004.jpg?w=996&t=st=1670335922~exp=1670336522~hmac=1e26e0ccb14772b6359335486c396b43536f1dfdb180772b575e00ffe490dd87");
            BufferedImage img = ImageIO.read(url);
            g1.drawImage(img, 1, 1, this);
            //URL url2 = new URL("https://sun9-35.userapi.com/impg/egG_d6sY1rHwpeEj_KNaHU6nwIpQxjbdKP3KKQ/PkXEw_Blyhw.jpg?size=320x320&quality=96&sign=f1cc911db57bd6b96a861ca959c2cf95&type=album");
            URL url2 = new URL("https://s3.ibta.ru/goods/143299/172d96ca751fe8b5fd63eed0f822f5cc_x.jpg");
            BufferedImage img2 = ImageIO.read(url2);
            Image scaleImage = img2.getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            g1.drawImage(scaleImage, 100, 100, this);*/

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getButtonName() {
        return "Ручки";
    }
}

