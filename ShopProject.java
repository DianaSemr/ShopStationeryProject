package ITProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.io.IOException;

public class ShopProject extends JFrame {//implements MenuListener
    private JPanel panel1; //меняющаяся панель в центре
    private final JPanel panel2; // панель для кнопок сверху
    MainFrame MF = new MainFrame();
    JButton button;
    JPanel panel3; //панель слева(поля)
    public ShopProject() throws IOException {
        super("Shop");
        setLayout(null);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        double width = getWidth();
        double height = getHeight();

        setSize(1500, 650);//800

        panel1.setLayout(null);
        panel3 = new JPanel();
        panel3.setSize(125, 615);//задаю размер/800
        panel3.setLocation(0, 35);//задаю местоположение
        panel3.setBackground(new Color(0xC6F1FF));
        add(panel3);
        panel1.setBackground(Color.WHITE);

        JPanel panel4 = new JPanel();//панель справа(поля)
        panel4.setSize(125, 615);//задаю размер
        panel4.setLocation(1150, 35);//задаю местоположение
        panel4.setBackground(new Color(0xC6F1FF));
        add(panel4);

        //pack();
        init();
    }
    private void init() {
        add(panel1);//добавляю меняющуюся панельку
        add(panel2);//добавляю панельку с кнопками

        panel2.setLayout(null);
        panel1.setLayout(new BorderLayout());
        panel1.add(new MainFrame());//добавляю главную панель на panel1
        panel1.revalidate();
        panel1.repaint();
        panel2.setBackground(new Color(0xE5E5F6));//устанавливаю цвет фона панели с кнопками
        panel2.setBounds(0,0,getSize().width,35);//задаю размеры панели с кнопками
        panel1.setBounds(125, 35, 1025, 615);//задаю разммеры меняющейся панельки/800

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MF = new MainFrame();
        button = new JButton(MF.getButtonName());//создаем кнопку, метод getButtonName() возвращает имя типа устанавливаемой панельки
        button.setSize(90, 35);//задаем размеры кнопки
        button.setLocation(10, 0);//задаем местоположение кнопки
        button.setBorderPainted(false);//убираем очертания кнопки
        button.setContentAreaFilled(false);//убираем заливку кнопки
        button.setFocusPainted(false);//убираем фокус на кнопке
        panel2.add(button);//добавляем кнопку на панельку
        button.addActionListener(new Action2(MF));
        addButton(new Pens(), new Pencil(),
                new Ruler(), new Backpack(), new Notebooks(),
                new Paints(), new Paper(), new Glue(),
                new ForChildren(), new Others(), new Discounts());//функция добавления кнопок на panel2

        //addButton();

        setSize(1500, 650);//устанавливаем размеры окна

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addButton(Stationery...k) {//функция добавления кнопок на panel2
        int l =  1;//номер устанавливаемой в данный момент кнопки
        for (Stationery st : k) {//для разных видов панелек типа Stationery
            JButton button1 = new JButton(st.getButtonName());//создаем кнопку, метод getButtonName() возвращает имя типа устанавливаемой панельки
            button1.setSize(90, 35);//задаем размеры кнопки
            button1.setLocation(l * 100 + 10, 0);//задаем местоположение кнопки
            button1.setBorderPainted(false);//убираем очертания кнопки
            button1.setContentAreaFilled(false);//убираем заливку кнопки
            button1.setFocusPainted(false);//убираем фокус на кнопке
            panel2.add(button1);//добавляем кнопку на панельку
            button1.addActionListener(new Action2(st));//добавляем действие
            l += 1;//переходим к следующей кнопке
        }
    }


    public class Action2 implements ActionListener{
        Stationery s;
        Action2(Stationery st)
        {
            s = st;//закидываем тип панельки, который мы будем ставить
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(s.getClass() == MainFrame.class) {
                panel2.remove(button);
                MF = new MainFrame();
                button = new JButton(MF.getButtonName());//создаем кнопку, метод getButtonName() возвращает имя типа устанавливаемой панельки
                button.setSize(90, 35);//задаем размеры кнопки
                button.setLocation(10, 0);//задаем местоположение кнопки
                button.setBorderPainted(false);//убираем очертания кнопки
                button.setContentAreaFilled(false);//убираем заливку кнопки
                button.setFocusPainted(false);//убираем фокус на кнопке
                panel2.add(button);//добавляем кнопку на панельку
                button.addActionListener(new Action2(MF));
            }

            panel1.removeAll();//очищаем panel1
            panel1.setLayout(new BorderLayout());
            JScrollPane pane = new JScrollPane(s);//создаем scrollPane и добавляем на нее новую панельку(страничку)
            panel1.add(pane);//добавляем scrollPane на panel1
            // panel1.add(s);
            panel1.revalidate();
            panel1.repaint();
            //думаю, нужно ли добавлять, чтобы панелька выходила изначальная, без изменений

           /*addButton(new MainFrame(), new Pens(), new Pencil(),
                   new Ruler(), new Backpack(), new Notebooks(),
                   new Paints(), new Paper(), new Glue(),
                   new ForChildren(), new Others(), new Discounts());//функция добавления кнопок на panel2*/
        }
    }
    private class Action implements ActionListener {
        Stationery mc;
        private Action(Stationery st)
        {
            mc = st;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            paint(mc);
        }
    }
    private void paint(Stationery f) {
        panel1.removeAll();//panel1
        panel1.setLayout(new BorderLayout());
        panel1.add(f);
        panel1.revalidate();
        panel1.repaint();
    }
}
class ButtonTest {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ShopProject frame = null;
            try {
                frame = new ShopProject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


