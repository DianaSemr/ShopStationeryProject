package ITProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
public class BasicDisc extends JPanel implements ActionListener {
    JButton button = new JButton("подробнее");
    JPanel all_panel = new JPanel();
    public BasicDisc(int width, int height, String url, String str, String text) {


        all_panel.setLayout(new CardLayout(0, 0)); ///

        all_panel.setPreferredSize(new Dimension(950, 345));//350 345
        all_panel.setBackground(new Color(253, 251, 251));
        //JPanel Panel = new JPanel(); ///
        setPreferredSize(new Dimension(width, height));  ///
        setBackground(new Color(253, 251, 251));  //
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); ////

        all_panel.add(new BasicDisc.Picture(width, height, url, str, text));
        all_panel.add(new BasicDisc.Text(text));
        add(all_panel);



        /*JPanel panel_for_picture = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel_for_picture.setOpaque(false);
        panel_for_picture.setPreferredSize(new Dimension(350, 350));

        try {
            URL u = new URL(url);
            BufferedImage img = ImageIO.read(u);
            Image scaleImage = img.getScaledInstance(340, 340,Image.SCALE_DEFAULT);
            JLabel picture = new JLabel(new ImageIcon(scaleImage));
            panel_for_picture.add(picture);
            Panel.add(panel_for_picture); ////

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        JPanel panel_for_label = new JPanel(new FlowLayout(FlowLayout.CENTER));    // панелька для цены
        panel_for_label.setOpaque(false);
        /*JLabel label = new JLabel();       // лейбл цена
        label.setText("Цена: "+str+" ₽  ");
        Font newFont = new Font("Serif", Font.PLAIN, 25);
        label.setFont(newFont);
        panel_for_label.add(label);*/



        Font font = new Font("Serif", Font.PLAIN, 25);
        //JButton button = new JButton("подробнее");
        button.setFont(font);
        button.setBorderPainted(false);//убираем очертания кнопки
        button.setContentAreaFilled(false);//убираем заливку кнопки
        //button.setFocusPainted(false);//убираем фокус на кнопке
        panel_for_label.add(button);

        //Buttons buttons = new Buttons(url, text);
        //Stationery st = buttons;
        //button.addActionListener(new Action(st));//добавляем действие
        button.addActionListener(this);

        add(panel_for_label);

        //Panel.add(buttons);  ////

        //add(Panel);

        setVisible(true);

    }

    class Picture extends JPanel
    {
        Picture(int width, int height, String url, String str, String text)
        {
            setBackground(new Color(253, 251, 251));
            JPanel panel_for_picture = new JPanel(new FlowLayout(FlowLayout.CENTER));
            panel_for_picture.setOpaque(false);
            panel_for_picture.setPreferredSize(new Dimension(950, 350));

            try {
                URL u = new URL(url);
                BufferedImage img = ImageIO.read(u);
                Image scaleImage = img.getScaledInstance(700, 340,Image.SCALE_DEFAULT);
                JLabel picture = new JLabel(new ImageIcon(scaleImage));
                panel_for_picture.add(picture);
                add(panel_for_picture); ////

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    class Text extends JPanel{
        Text(String text){
            setBackground(new Color(253, 251, 251));

            JPanel panel_for_text = new JPanel();
            panel_for_text.setBackground(new Color(253, 251, 251));
            panel_for_text.setPreferredSize(new Dimension(350, 350));

            JLabel label_text = new JLabel();
            label_text.setPreferredSize(new Dimension(350, 350));
            label_text.setHorizontalAlignment(JLabel.LEFT);
            label_text.setText(text);
            Font newFont = new Font("Serif", Font.PLAIN, 20);
            label_text.setFont(newFont);

            panel_for_text.add(label_text);

            add(panel_for_text);
        }

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            ((CardLayout) all_panel.getLayout()).next(all_panel);
        }
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
        removeAll();//panel1
        setLayout(new BorderLayout());
        add(f);
        revalidate();
        repaint();
    }*/


}
