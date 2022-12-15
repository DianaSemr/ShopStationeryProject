package ITProject;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import java.awt.event.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static java.awt.FlowLayout.*;

public class ShopProject extends JFrame {//implements MenuListener
    private JPanel panel1;
    private final JPanel currentPanel = panel1; // панель, которую мы будем менять при нажатии на кнопку
    private final JPanel panel2; // панель для кнопок

    JPanel panel3;
    public ShopProject() throws IOException {
        super("Shop");
        setLayout(null);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        double width = getWidth();
        double height = getHeight();


        panel1.setSize(getWidth(), 500);
        panel1.setLocation(0, 0);
        panel2.setSize(100, getHeight() - 500);
        panel2.setLocation(0, 500);
        setSize(1500, 800);
        panel1 = new JPanel();
        panel1.setLayout(null);
        //panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS)); /// добавила то что в скобках
        panel3 = new JPanel();
        panel3.setSize(125, 800);
        panel3.setLocation(0, 35);
        panel3.setBackground(new Color(0xC6F1FF));
        add(panel3);
        panel1.setBackground(Color.WHITE);

        JPanel panel4 = new JPanel();
        panel4.setSize(125, 800);
        panel4.setLocation(1150, 35);
        panel4.setBackground(new Color(0xC6F1FF));
        add(panel4);

        //pack();
        init();
    }
    private void init() {
        add(panel1);
        add(panel2);

        panel2.setLayout(null);
        panel1.setLayout(new BorderLayout());
        panel1.add(new MainFrame());
        panel1.revalidate();
        panel1.repaint();
        panel2.setBackground(new Color(0xE5E5F6));
        panel2.setBounds(0,0,1500,35);
        panel1.setBounds(125, 35, 1025, 800);
        setSize(1500, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addButton(new MainFrame(), new Pens(), new Pencil(),
                new Ruler(), new Backpack(), new Notebooks(),
                new Paints(), new Paper(), new Glue(),
                new ForChildren(), new Others(), new Discounts());

        //addButton();

        setSize(1500, 800);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addButton(Stationery...k) {
        int l =  0;
        for (Stationery st : k) {
            JButton button = new JButton(st.getButtonName());
            button.setSize(90, 35);
            button.setLocation(l * 100 + 10, 0);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setFocusPainted(false);
            panel2.add(button);
            button.addActionListener(new Action2(st));
            l += 1;
        }
    }

   /* @Override
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
*/
    public class Action2 implements ActionListener{
       Stationery s;
        Action2(Stationery st)
        {
           s = st;
        }

       @Override
       public void actionPerformed(ActionEvent e) {
            panel1.removeAll();
            panel1.setLayout(new BorderLayout());
            panel1.add(s);
            panel1.revalidate();
            panel1.repaint();

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


