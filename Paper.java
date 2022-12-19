package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Paper extends Stationery {

    public Paper(){
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
        name.setText("Бумага");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/110532/c6381cc5b46279bef6e8f993cf86eda8_s.jpg", "299", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — C.</p>"+"<p>Серия — нет.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 500.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/114738/6d555e27fed73f6f166b98bf76c144e4_x.jpg", "240", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — B.</p>"+"<p>Серия — OFFICE.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 500.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/110520/0101bc8efb0e197119cd14af16e05b99_x.jpg", "155", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — C.</p>"+"<p>Серия — нет.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 100.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/114324/af56c73d43f215dbdbd5cbdfcba25ea9_x.jpg", "281", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — C.</p>"+"<p>Серия — ECO.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 500.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/110437/f351ac443fa2034e255c93990e17b53c_x.jpg", "349", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — C.</p>"+"<p>Серия — Performer.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 500.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/110071/1d3aeaf5bee5d0df9d92301a5f31d54b_x.jpg", "309","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Формат — А4.</p>"+"<p>Марка — C.</p>"+"<p>Серия — Снегурочка.</p>"+"<p>Плотность — 72-80 +/- 2-3 г/м2.</p>"+"<p>Количество листов в пачке — 500.</p>"+"<p>Устойчива к старению — да.</p>"+"<p>Производитель — Россия</p>"+"</html>");


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
        return "Бумага";
    }
}

