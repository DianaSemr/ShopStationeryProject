package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Backpack extends Stationery {

    public Backpack(){
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
        name.setText("Рюкзаки");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/270091/7f5d4272b0ac3d97ec3ca0bf559c1adc_x.jpg", "1379", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — унисекс.</p>"+"<p>Серия — FRIENDLY.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — хаки.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/270800/5616b2591e726b5af31417e3ce65f1fc_x.jpg", "1059", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — унисекс.</p>"+"<p>Серия — INTENSE.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — черный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/225377/28298eaf0d2355be112ea558291b53a2_x.jpg", "594", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — унисекс.</p>"+"<p>Серия — Сити-формат один тон.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — салатовый.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/270670/f272006c8fade0e849b2f607fb47afc9_x.jpg", "1656", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — для мальчиков.</p>"+"<p>Серия — STAR.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — черный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/224454/194f01116558ccf4afb68d34b2531fd8_x.jpg", "1699", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — для мальчиков.</p>"+"<p>Серия — FUNCTIONAL.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — черный/красный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/270782/8d3944c8c7eac5506b17b6fa501986a4_x.jpg", "700","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Пол — унисекс.</p>"+"<p>Серия — POSITIVE.</p>"+"<p>Количество отделений — 1.</p>"+"<p>Регулируемые лямки — да.</p>"+"<p>Наличие ручки для переноса — да.</p>"+"<p>Материал — полиэстер.</p>"+"<p>Цвет — черный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");


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
        return "Рюкзаки";
    }
}

