package ITProject;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Glue extends Stationery {

    public Glue(){
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
        name.setText("Клей");
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
        Basic panel1 = new Basic(400, 400, "https://images.firma-gamma.ru/images/5/2/g59330420822.jpg", "55", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд STILSY</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Назначение - для керамики</p>"+"<p>Вес 120 г.</p>"+"<p>Тип товара - клей</p>"+"<p>Тип склеиваемой поверхности бумага, картон</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://images.firma-gamma.ru/images/5/3/g59328754332.jpg", "19.90", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  KANZY</p>"+"<p>Страна производства - Россия</p>"+"<p>Вес 45 г.</p>"+"<p>Тип товара - клей</p>"+"<p>Тип склеиваемых поверхностей - бумага, картон, дерево</p>"+"<p>Артикул KNY-045</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://images.firma-gamma.ru/images/8/1/df4020100185l.jpg", "156", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Момент</p>"+"<p>Страна происхождения - Ирландия</p>"+"<p>Для рукоделия, для творчества</p>"+"<p>Вес 3 г.</p>"+"<p>Тип склеиваемых поверхностей - универсальный</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://images.firma-gamma.ru/images/d/a/g51987543812.jpg", "372", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Craft&Clay</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Артикул  TRK</p>"+"<p>ОбЪем 50 мл</p>"+"<p>Тип товара - клей</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://images.firma-gamma.ru/images/7/1/d91870253534l.jpg", "84", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд - Kores</p>"+"<p>Страна происхождения - Чехия</p>"+"<p>Назначение - для творчества</p>"+"<p>Длина - 10.9 см</p>"+"<p>Ширина - 2.5 см</p>"+"<p>Высота - 2.5 см</p>"+"<p>Вес - 20 г</p>"+"<p>Тип склеиваемых поверхностей - бумага</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://images.firma-gamma.ru/images/7/3/df31671558242l.jpg", "60","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд - Капелька.</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Назначение - для рукоделия, для творчества</p>"+"<p>Вес - 20 г</p>"+"<p>Тип склеиваемых поверхностей - универсальный</p>"+"<p>Тип упаковки - в тубе</p>"+"<p>Артикул наименования - 1303310</p>"+"<p>Цвет упаковкий - синий</p>"+"</html>");


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
    }

    @Override
    public String getButtonName() {
        return "Клей";
    }
}


