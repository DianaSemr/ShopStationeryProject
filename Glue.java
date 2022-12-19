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
    }

    @Override
    public String getButtonName() {
        return "Клей";
    }
}


