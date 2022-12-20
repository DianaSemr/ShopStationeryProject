package ITProject;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Discounts extends Stationery {
    public Discounts() {

        JPanel all = new JPanel();   // общая панель
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
        // setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(getWidth(), 2000));

        Animation animation = new Animation(0, 0, "https://semyaivera.ru/wp-content/uploads/2016/01/Girlyanda-zhivaya.gif", 80);
        all.add(animation);

        JPanel panel_for_name = new JPanel(new FlowLayout(FlowLayout.CENTER));    // панелька для названя
        JLabel name = new JLabel();       // лейбл название
        name.setText("Акции");
        Font newFont = new Font("Serif", Font.ITALIC, 70);
        name.setFont(newFont);

        panel_for_name.add(name);          // добавляем лейбл на панель с названием
        //panel_for_name.setBackground(new Color(29, 131, 246));

        name.setOpaque(false);
        panel_for_name.setOpaque(false);
        all.add(panel_for_name);        // добавляем панель с названием в общую панель


        JPanel panel_for_end = new JPanel();
        panel_for_end.setPreferredSize(new Dimension(50, 60));
        //panel_for_end.setSize(500, 1000);
        //panel_for_end.setBackground(new Color(0,0,0));
        panel_for_end.setOpaque(false);
        all.add(panel_for_end);


        JPanel panel = new JPanel();       //  общая панель для картинок
        //panel.setSize(getWidth(), getHeight());

        GridLayout grid = new GridLayout(6, 1, 50, 50);    //  панелька-табличка
        panel.setLayout(grid);
        BasicDisc panel1 = new BasicDisc(850, 400, "https://izhevsk.ru/forums/icons/forum_pictures/asyncupload/50324/2017/7/11/1499800215U50324TOPE4309692630_orig.jpg", "27", "<html>"+"<p>Собираемся в новом году в школу вместе</p>"+ "<p>С 15 декабря по 15 января различные канцелярские товары для школы со скидкой 30%.</p>"+"</html>");
        BasicDisc panel2 = new BasicDisc(850, 400, "https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png", "15", "<html>"+"<p>В Новый год происходит много чудес:</p>"+ "<p>даже цены замерли в ожидании волшебства.</p>"+"<p>Скорее забирайте под ёлку яркие краски, забавные игрушки и праздничные украшения.</p>"+"</html>");
        BasicDisc panel3 = new BasicDisc(850, 400, "https://northcliffe.ru/wp-content/uploads/a/a/3/aa34449c49a0683095ff722d6439db45.jpeg", "30", "<html>"+"<p>Новинка</p>"+ "<p>Теперь можно приобрести краску для дверей, стен, потолка и т.д.</p>"+"Скидка 10% на весь ассортимент!</p>"+"</html>");
        BasicDisc panel4 = new BasicDisc(850, 400, "http://brikcentr.ru/public/upload/news/2020/2-banner.jpg", "17", "<html>"+"<p>Акция: Карандаш в подарок!</p>"+ "<p>В акции учавствуют шариковая автоматическая ручка Penac X-ball (0,7мм синяя) и шариковая автоматическая ручка Penac Soft Glider (1.6мм синяя) с японсикм механизмом.</p>"+"<p>Чернила на масляной основе!</p>"+"</html>");

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);

        /*for (int i = 0; i < 6; i++) {
            JPanel picture = new JPanel();    //  одна клеточка
            picture.setPreferredSize(new Dimension(400, 400));
            picture.setBackground(new Color(243, 236, 236));
            panel.add(picture);    // добавляем клеточку на панель для картинок

        }*/

        panel.setOpaque(false);
        all.add(panel);

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
        return "Акции";
    }
}


