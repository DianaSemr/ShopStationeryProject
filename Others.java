package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class Others extends Stationery {

    public Others(){
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
        name.setText("Другое");
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
        Basic panel1 = new Basic(400, 400, "https://images.firma-gamma.ru/images/0/b/g76193674434.jpg", "155", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд - Expert Complete</p>"+"<p>Страна происхождения - Китай</p>"+"<p>Артикул - EHL-01</p>"+"<p>Тип товара - Маркер</p>"+"<p>Вид маркера - текстовыделитель</p>"+"<p>Основа - водная</p>"+"</html>");
        Basic panel2 = new Basic(400, 400, "https://images.firma-gamma.ru/images/2/d/d64692602134l.jpg", "89", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Boomzi</p>"+"<p>Страна происхождения - Китай</p>"+"<p>Рекомендуемый возраст - от 3 лет</p>"+"<p>Размер - 25 см</p>"+"<p>Артикул - BLS-25</p>"+"<p>Количество - 10 штук</p>"+"<p>Тип товара - шарик</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://images.firma-gamma.ru/images/e/6/g19506928282.jpg", "202", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Vista Artista</p>"+"<p>Страна происхождения - Китай</p>"+"<p>Техника пастель</p>"+"<p>Назначение - для рисования</p>"+"<p>Основа - масляная</p>"+"<p>Количество цветов - 12</p>"+"<p>Артикул - VAOP-12</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://images.firma-gamma.ru/images/a/a/d9662989682l.jpg", "115", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  - Выдумщики</p>"+"<p>Страна производства - Россия</p>"+"<p>Назначение - мыловарение</p>"+"<p>Вес  5 г.</p>"+"<p>Тип товара - блестки</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://images.firma-gamma.ru/images/3/d/g10748094002p.jpg", "46", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Zlatka</p>"+"<p>Страна происхождения - Китай</p>"+"<p>Аотикул - GC</p>"+"<p>Тип товара - бисер</p>"+"<p>Материал  - стекло</p>"+"<p>Вес - 10 г.</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://images.firma-gamma.ru/images/a/6/g6157356002.jpg", "99","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Пехорский текстиль</p>"+"<p>Страна производства  -  Россия</p>"+"<p>Тип товара - пряжа</p>"+"<p>Вес - 50 г.</p>"+"<p>Состав - 100% высокообъемный акрил</p>"+"<p>Толщина нити - средняя</p>"+"</html>");


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
        return "Другое";
    }
}

