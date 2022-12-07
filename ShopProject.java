package ITProject;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.image.BufferedImage;
import java.net.URL;

import static java.awt.FlowLayout.*;

public class ShopProject extends JFrame {
    private final JPanel panel1;
    private final JPanel panel2;

    public ShopProject() {
        super("Shop");
        setLayout(null);
        this.setBackground(new Color(0x05C3FC));
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel();
        init();
    }

    private void init() {
        add(new Button("Start"));
        panel2.setLayout(null);
        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 35, 125, 800);
        panel3.setBackground(new Color(0xB6D5E5));
        add(panel3);
        JPanel panel4 = new JPanel();
        panel4.setBounds(1155, 35, 125, 800);
        panel4.setLayout(null);
        panel4.setBackground(new Color(0xB6D5E5));
        add(panel3);
        add(panel4);
        add(panel1);
        add(panel2);
        panel2.setBackground(new Color(0xE5E5F6));
        panel2.setBounds(0,0,1280,35);
        panel1.setBounds(125, 35, 1030, 800);
        setSize(1500, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addButton(new MainFrame(), new Pens(), new Pencil(),
                new Ruler(), new Backpack(), new Notebooks(),
                new Paints(), new Paper(), new Glue(),
                new ForChildren(), new Others(), new Discounts());
    }

    private void addButton(Stationery...k) {
        int l =  0;
        for (Stationery st : k) {
            JButton button = new JButton(st.getButtonName());
            button.setSize(90, 35);
            button.setLocation(l * 105 + 10, 0);
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setFocusPainted(false);
            panel2.add(button);
            button.addActionListener(new Action(st));
            l += 1;
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
        panel1.add(f);
        panel1.revalidate();
        panel1.repaint();
    }
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



