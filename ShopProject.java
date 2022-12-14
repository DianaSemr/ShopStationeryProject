package ITProject;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import java.awt.event.*;

import java.awt.image.BufferedImage;
import java.net.URL;

import static java.awt.FlowLayout.*;

public class ShopProject extends JFrame implements MenuListener {
    //private final JPanel panel1;
    //private final JPanel panel2 = new JPanel(); // панель для кнопок

    //JPanel panel3;

    JPanel panel = new JPanel();     // общая панель для всего фрейма

    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    int width =Toolkit.getDefaultToolkit().getScreenSize().width;
    Buttons buttons = new Buttons(width, 50, this); // класс для кнопок

    Basic basic = new Basic(width, height - 50, "MainFrame"); // класс для основного экрана

    public ShopProject() {
        super("Shop");
        //setLayout(null);

        /*panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        double width = getWidth();
        double height = getHeight();*/

        /*panel1.setSize(getWidth(), 500);
        panel1.setLocation(0,0);
        panel2.setSize(100, getHeight() - 500);
        panel2.setLocation(0, 500);
        pack();
        init();*/

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(buttons);
        panel.add(basic);

        getContentPane().add(panel);

        setSize(1500, 800);
        /*this.setBackground(new Color(0x05C3FC));
        panel1 = new JPanel(new BorderLayout());
        panel1.add(new MainFrame());
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS)); /// обавила то что в скобках
        panel3 = new JPanel();
        panel3.setSize(100, 100);
        panel3.setLocation(300, 400);
        panel1.add(panel3);///


        pack();
        init();*/

    }

    /*private void init() {
        add(new Button("Start"));
        add(panel1);
        add(panel2);



        //panel2.setLayout(null);
        panel2.setBackground(new Color(0xE5E5F6));
        panel2.setBounds(0,0,1500,35);
        panel1.setBounds(125, 35, 1500, 800);
        setSize(1500, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*addButton(new MainFrame(), new Pens(), new Pencil(),
                new Ruler(), new Backpack(), new Notebooks(),
                new Paints(), new Paper(), new Glue(),
                new ForChildren(), new Others(), new Discounts());/

        //addButton();

        setSize(1500, 800);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }*/


    /*private void addButton() {
        panel2.add(Box.createHorizontalGlue());
        panel2.add(MainFrame);
        MainFrame.setBorderPainted(false);
        MainFrame.setContentAreaFilled(false);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Pens);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Pencil);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Ruler);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Backpack);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Notebooks);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Paints);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Paper);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Glue);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(ForChildren);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Others);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Discounts);
        panel2.add(Box.createHorizontalGlue());
    }*/

    /*private void addButton(Stationery...k) {
        int l =  0;
        for (Stationery st : k) {
            JButton button = new JButton(st.getButtonName());
            button.setSize(90, 35);
            button.setLocation(l * 100 + 10, 0);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setFocusPainted(false);
            panel2.add(button);
            button.addActionListener(new Action(st));
            l += 1;
        }
    }*/

    @Override
    public void menuSelected(MenuEvent e) {   //обработчик для кнопок
        if (e.getSource() == buttons.Pens)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Pens");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Pencil)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Pencil");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Discounts)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Discounts");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Others)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Others");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Glue)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Glue");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.ForChildren)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "ForChildren");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Ruler)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Ruler");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.MainFrame)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "MainFrame");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Paper)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Paper");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Backpack)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Backpack");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Notebooks)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Notebooks");
            panel.add(basic);
            panel.updateUI();
        }
        if (e.getSource() == buttons.Paints)
        {
            panel.remove(basic);
            basic = new Basic(width, height - 50, "Paints");
            panel.add(basic);
            panel.updateUI();
        }

    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }

    /*private class Action implements ActionListener {
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
        panel1.add(f);
        panel1.revalidate();
        panel1.repaint();
    }*/
}
class ButtonTest {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShopProject frame = new ShopProject();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}


