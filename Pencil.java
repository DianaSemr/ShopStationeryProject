package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Pencil extends Stationery {

    public Pencil() {

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
        name.setText("Карандаши");
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
        Basic panel1 = new Basic(400, 400, "https://s3.ibta.ru/goods/180094/7fe7591c2dae67cb8364a493be8b1ae5_s.jpg", "32", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — да.</p>"+"<p>Диаметр грифеля — 2.3 мм.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — пластик.</p>"+"<p>Цвет корпуса — зеленый.</p>"+"<p>Производитель — Франция.</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://s3.ibta.ru/goods/181326/b8867df5c8a54e95de808eb33de26b92_s.jpg", "12", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — да.</p>"+"<p>Диаметр грифеля — 2.2 мм.</p>"+"<p>Форма корпуса — шестигранная.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — пластик.</p>"+"<p>Цвет корпуса — зеленый.</p>"+"<p>Производитель — Россия.</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://s3.ibta.ru/goods/181294/d71492710740d7f49c6570b74b31de21_s.jpg", "17", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — да.</p>"+"<p>Диаметр грифеля — 2.8 мм.</p>"+"<p>Форма корпуса — трехгранная.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — дерево.</p>"+"<p>Цвет корпуса — красный/синий.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://s3.ibta.ru/goods/181297/462d967ccc6de402f613cb5eb5229644_s.jpg", "16", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — нет.</p>"+"<p>Диаметр грифеля — 2.8 мм.</p>"+"<p>Форма корпуса — трехгранная.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — дерево.</p>"+"<p>Цвет корпуса — черный.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://s3.ibta.ru/goods/180654/fb3e2c8efb0c6c42e9c432c181efeba5_s.jpg", "8", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — да.</p>"+"<p>Диаметр грифеля — 2.05 мм.</p>"+"<p>Форма корпуса — круглая.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — дерево.</p>"+"<p>Цвет корпуса — с дизайном.</p>"+"<p>Производитель — Китай.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://s3.ibta.ru/goods/181295/1d3b39486b63d869477ccb5fbdefac84_s.jpg", "17","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Твердость — HB.</p>"+"<p>Наличие ластика — да.</p>"+"<p>Диаметр грифеля — 2.8 мм.</p>"+"<p>Форма корпуса — трехгранная.</p>"+"<p>Ударопрочный грифель — да.</p>"+"<p>Материал корпуса — дерево.</p>"+"<p>Цвет корпуса — фиолетовый/серебристый.</p>"+"<p>Производитель — Китай.</p>"+"</html>");


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

        /*Basic panel1 = new Basic(400, 400, "https://www.ukazka.ru/img/g/uk965753.jpg", "17","dg");
        Basic panel2 = new Basic(400, 400, "https://artmarker.ru/upload/resize_cache/iblock/c1b/700_700_0/c1bccf2a39c634c9545872f9cfcad52b.jpeg", "25", "sg");
        Basic panel3 = new Basic(400, 400, "https://avatars.mds.yandex.net/get-mpic/2991631/img_id8249381499784622116.jpeg/orig", "33", "jsn");
        Basic panel4 = new Basic(400, 400, "https://do-sketch.ru/wa-data/public/shop/products/52/20/32052/images/24123/24123.970.png", "11", "af");
        Basic panel5 = new Basic(400, 400, "https://krasniykarandash.ru/upload/resize/618091/618091_800x800x70.jpg", "19", "ijf");
        Basic panel6 = new Basic(400, 400, "https://kalem-kanc.ru/image/catalog/relef/karandashi-tsvetnye-professionalnye-klassicheskie/IMGbc3931e5defee206eec3f8cd5454143d.jpg", "22", "jfe");
*/
    }
    @Override
    protected void paintStationery(java.awt.Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        g1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g1.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

    }

    @Override
    public String getButtonName() {
        return "Карандаши";
    }
}
