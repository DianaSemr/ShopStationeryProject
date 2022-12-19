package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Notebooks extends Stationery {

    public Notebooks(){
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
        name.setText("Тетради");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/105639/fb948bbebd40c67e5f093e0c83912b1b_x.jpg", "16", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — клетка.</p>"+"<p>Количество листов — 12.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — КЛАССИЧЕСКАЯ.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — скоба.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/403033/b2a26554e8cf3c1174cca1314a23f67b_x.jpg", "37", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — клетка.</p>"+"<p>Количество листов — 48.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — Картон.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — скоба.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/106276/0e2a029d9e92da8ce231c08da2cc07ee_x.jpg", "9", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — линия.</p>"+"<p>Количество листов — 18.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — зеленая.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — скоба.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/402797/035d59fdd80ca5179b8b153cf66f5b20_x.jpg", "76", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — клетка.</p>"+"<p>Количество листов — 96.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — Картон.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — гребень.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/404277/3e2862b9ff0ee8c18d1766fcd3dc4766_x.jpg", "32", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — клетка.</p>"+"<p>Количество листов — 48.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — AVOCADO.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — скоба.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/402791/e6df763fcba2c5c395dc10a742eeeede_x.jpg", "37","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Линовка блока — клетка.</p>"+"<p>Количество листов — 48.</p>"+"<p>Формат — А5.</p>"+"<p>Серия — Картон.</p>"+"<p>Наличие полей — да.</p>"+"<p>Тип скрепления — скоба.</p>"+"<p>Производитель — Россия.</p>"+"</html>");


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
        return "Тетради";
    }
}


