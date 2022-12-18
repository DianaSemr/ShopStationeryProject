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
        setBackground(new Color(203, 236, 239));
        setPreferredSize(new Dimension(getWidth(), 2000));

        Animation animation = new Animation(0, 0, "https://semyaivera.ru/wp-content/uploads/2016/01/Girlyanda-zhivaya.gif");
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
        BasicDisc panel1 = new BasicDisc(650, 400, "https://izhevsk.ru/forums/icons/forum_pictures/asyncupload/50324/2017/7/11/1499800215U50324TOPE4309692630_orig.jpg", "27", "<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — синий.</p>"+"<p>Стиль — для офиса и учебы.</p>"+"<p>Длина сменного стержня — 140 мм.</p>"+"<p>Толщина линии письма — 0.35 мм.</p>"+"<p>Эргономичная зона захвата — рифление.</p>"+"</html>");
        BasicDisc panel2 = new BasicDisc(650, 400, "https://img.labirint.ru/images/att/news/1-18839-1513940445-9352.png", "15", "<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — красный.</p>"+"<p>Серия — Ultra Orange.</p>"+"</html>");
        BasicDisc panel3 = new BasicDisc(650, 400, "https://s3.ibta.ru/goods/143227/7a7077ea65b238f4b7670c01475b5084_l.jpg", "30", "<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — красный.</p>"+"<p>Серия — Ultra Orange.</p>"+"</html>");
        BasicDisc panel4 = new BasicDisc(650, 400, "https://s3.ibta.ru/goods/143562/57c62c06436dd03ca0e12cf59279bde6_l.jpg", "17", "<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — красный.</p>"+"<p>Серия — Ultra Orange.</p>"+"</html>");
        BasicDisc panel5 = new BasicDisc(650, 400, "https://s3.ibta.ru/goods/143444/c4963ab41f85604e9d22eb59c1d907ed_l.jpg", "49", "<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — красный.</p>"+"<p>Серия — Ultra Orange.</p>"+"</html>");
        BasicDisc panel6 = new BasicDisc(650, 400, "https://s3.ibta.ru/goods/140053/b2b00dd3f6af3827c2aaba0789a8c189_l.jpg", "24","<html>"+"<p>Характеристики</p>"+ "<p>Цвет чернил — красный.</p>"+"<p>Серия — Ultra Orange.</p>"+"</html>");


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
        return "Скидки";
    }
}


