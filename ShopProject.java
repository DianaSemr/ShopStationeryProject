package ITProject;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ShopProject extends JFrame {
    private final JPanel panel1;
    private final JPanel panel2;

    public ShopProject() {
        super("Shop");
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel();
        init();
    }

    private void init() {
        add(panel1);
        add(panel2, BorderLayout.WEST);
        setSize(650, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addButton(new Pencil());
    }

    private void addButton(Stationery...k) {
        for (Stationery st : k) {
            JButton button = new JButton(st.getButtonName());
            panel2.add(button);
            button.addActionListener(new Action(st));
        }
    }
    private class Action implements ActionListener {
        Stationery mc;
        Color backgroundColor;
        private Action(Stationery st)
        {
            mc = st;
            if(mc.getClass() == Pencil.class)
                backgroundColor = new Color(0xF5F5A9);
            else
                backgroundColor = new Color(0xAEAEDC);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            paint(mc);
            panel1.setBackground(backgroundColor);
        }
    }
    private void paint(Stationery f) {
        panel1.removeAll();
        panel1.add(f);
        panel1.revalidate();
        panel1.repaint();
    }
}
class ButtonTest {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShopProject frame = new ShopProject();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}



