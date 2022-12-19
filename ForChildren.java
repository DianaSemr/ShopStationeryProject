package ITProject;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
public class ForChildren extends Stationery {

    public ForChildren(){
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
        name.setText("Для детей");
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
        Basic panel1 = new Basic(400, 400, "https://images.firma-gamma.ru/images/f/8/g75133776934p.jpg", "120", "<html>"+"<p><h1>Характеристики</h1></p>"+"<p>Артикул  CDL-03</p>"+ "<p>Вид пластилина   легкий</p>"+"<p>Количество цветов   12</p>"+"<p>Цвет  ассорти</p>" +"<p>Производитель — Беларусь</p>" + "</html>");
        Basic panel2 = new Basic(400, 400, "https://images.firma-gamma.ru/images/d/9/g75133737104p.jpg", "532", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Hobbius</p>"+"<p>Страна происхождения - Беларусь</p>"+"<p>Рекомендуемый возраст - от 3 лет</p>"+"<p>Артикул - CDL-02</p>"+"<p>Вид пластилина  легкий</p>"+"<p>Количество цветов - 6</p>"+"<p>Цвет - ассорти</p>"+"</html>");
        Basic panel3 = new Basic(400, 400, "https://flamingo.am/image/cache/catalog/Grenakanpituyqner/Notatetrer/21000040/Notebook-Unicorn-1-1000x1000.jpg", "219", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  ЯиГрушка</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Рекомендуемый возраст - от 8 лет</p>"+"<p>Тип товара - блокнот</p>"+"<p>Артикул - 16626</p>"+"</html>");
        Basic panel4 = new Basic(400, 400, "https://images.firma-gamma.ru/images/5/e/d73269262264p.jpg", "79", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -   Lori</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Рекомендуемый возраст от 6 лет</p>"+"<p>Ширина - 10</p>"+"<p>Длина - 15</p>"+"<p>Тип товара - Гравюра</p>"+"<p>Артикул - Гр-594</p>"+"<p>Тема - Животные</p>"+"</html>");
        Basic panel5 = new Basic(400, 400, "https://images.firma-gamma.ru/images/d/0/d71657715044l.jpg", "242", "<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -  Hobbius</p>"+"<p>Страна происхождения - Беларусь</p>"+"<p>Рекомендуемый возраст - от 7 лет<p>"+"<p>Артикул   TLS-02</p>"+"<p>Тип товара - Мозаика</p>"+"<p>Тематика  Птицы</p>"+"</html>");
        Basic panel6 = new Basic(400, 400, "https://images.firma-gamma.ru/images/c/b/d73269335504l.jpg", "24","<html>"+"<p><h1>Характеристики</h1></p>"+ "<p>Бренд  -   Lori</p>"+"<p>Страна происхождения - Россия</p>"+"<p>Рекомендуемый возраст от 6 лет</p>"+"<p>Ширина - 10</p>"+"<p>Длина - 15</p>"+"<p>Тип товара - Гравюра</p>"+"<p>Артикул - Гр-616</p>"+"<p>Тема - Цветы</p>"+"</html>");


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
        return "Для детей";
    }
}

