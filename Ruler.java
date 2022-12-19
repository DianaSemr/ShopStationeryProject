package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Ruler extends Stationery {

    public Ruler(){
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
        name.setText("Линейки");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/210735/515f5ba6a0c27834d95bbddf48e7deb6_s.jpg", "52", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — ШКОЛЬНАЯ.</p>"+"<p>Длина шкалы — 20 см.</p>"+"<p>Материал — пластик.</p>"+"<p>Количество шкал — 1 шт.</p>"+"<p>Прозрачная — да.</p>"+"<p>Цвет — с дизайном.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/210286/a08547f326319b7ff926ef179ee4065f_s.jpg", "46", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — Office.</p>"+"<p>Длина шкалы — 30 см.</p>"+"<p>Материал — пластик.</p>"+"<p>Количество шкал — 2 шт.</p>"+"<p>Прозрачная — да.</p>"+"<p>Цвет — бесцветный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/210303/4b4c31842d889df07a90402718bb50f6_s.jpg", "86", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — нет.</p>"+"<p>Длина шкалы — 30 см.</p>"+"<p>Материал — пластик.</p>"+"<p>Количество шкал — 2 шт.</p>"+"<p>Прозрачная — да.</p>"+"<p>Цвет — бесцветный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/210612/e3252f7d31ced565160492c65915dfa7_s.jpg", "31", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — Black 1.</p>"+"<p>Длина шкалы — 30 см.</p>"+"<p>Материал — пластик.</p>"+"<p>Количество шкал — 1 шт.</p>"+"<p>Прозрачная — нет.</p>"+"<p>Цвет — черный.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/210610/63c99c5dceebac14415f49f43b38abde_s.jpg", "31", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — Tone.</p>"+"<p>Длина шкалы — 30 см.</p>"+"<p>Материал — пластик.</p>"+"<p>Количество шкал — 1 шт.</p>"+"<p>Прозрачная — да.</p>"+"<p>Цвет — тонированный.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/210381/c173131b64fb195ee3277b83052ff26d_s.jpg", "33","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Тип — классическая.</p>"+"<p>Серия — Metal.</p>"+"<p>Длина шкалы — 30 см.</p>"+"<p>Материал — металл.</p>"+"<p>Количество шкал — 2 шт.</p>"+"<p>Прозрачная — нет.</p>"+"<p>Цвет — серебряный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");


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
        return "Линейки";
    }
}

