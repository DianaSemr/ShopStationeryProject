package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Paints extends Stationery {

    public Paints(){
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
        name.setText("Краски");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/191745/f92d411459837e247e9691c65d20b364_x.jpg", "301", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Количество цветов в наборе — 28.</p>"+"<p>Серия — PREMIUM.</p>"+"<p>Отделение для кисточки — да.</p>"+"<p>Форма кювет — круглая.</p>"+"<p>Упаковка — пластиковая коробка с европодвесом.</p>"+"<p>Производитель — Китай</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/191527/3755434fc36626ecf6c710c40921b2be_x.jpg", "88", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Количество цветов в наборе — 12.</p>"+"<p>Серия — Школьные.</p>"+"<p>Отделение для кисточки — да.</p>"+"<p>Форма кювет — квадратная.</p>"+"<p>Упаковка — пластиковая коробка.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/192281/5858ec13712989a6c2dea1fd63b58575_x.jpg", "49", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Количество цветов в наборе — 6.</p>"+"<p>Серия — kids.</p>"+"<p>Отделение для кисточки — да.</p>"+"<p>Форма кювет — квадратная.</p>"+"<p>Упаковка — пластиковая коробка с европодвесом.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/192286/03d6a97ae63254831d806174165905f2_x.jpg", "104", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Количество цветов в наборе — 12.</p>"+"<p>Серия — Магия цвета.</p>"+"<p>Отделение для кисточки — да.</p>"+"<p>Форма кювет — круглая.</p>"+"<p>Упаковка — пластиковая коробка с европодвесом.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/191746/2f1fc84d2370896eb997dfa625adeb0a_x.jpg", "184", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Количество цветов в наборе — 36.</p>"+"<p>Серия — PREMIUM.</p>"+"<p>Отделение для кисточки — да.</p>"+"<p>Форма кювет — круглая.</p>"+"<p>Упаковка — пластиковая коробка с европодвесом.</p>"+"<p>Производитель — Китай</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://avatars.mds.yandex.net/get-mpic/5234126/img_id1697240919903304863.jpeg/orig", "305","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Цветовая палитра — белый.</p>"+"<p>Внешний вид — матовый.</p>"+"<p>Основа — водная.</p>"+"<p>Тип полимера — акрил.</p>"+"<p>Срок годности — 12 месяцев.</p>"+"<p>Производитель — Россия</p>"+"</html>");


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
        return "Краски";
    }
}

