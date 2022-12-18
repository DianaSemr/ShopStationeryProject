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
        setBackground(new Color(171, 236, 243));
        setPreferredSize(new Dimension(getWidth(), 1600));

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


        JPanel panel_for_end = new JPanel();
        panel_for_end.setPreferredSize(new Dimension(50, 60));
        //panel_for_end.setSize(500, 1000);
        //panel_for_end.setBackground(new Color(0,0,0));
        panel_for_end.setOpaque(false);
        all.add(panel_for_end);


        JPanel panel = new JPanel();       //  общая панель для картинок
        //panel.setSize(getWidth(), getHeight());

        GridLayout grid = new GridLayout(3, 2, 50, 50);    //  панелька-табличка
        panel.setLayout(grid);
        Basic panel1 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=5e11c5468ce1fbb10b967fcae9636ffb25e32e8d-5246350-images-thumbs&n=13", "17");
        Basic panel2 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=be86449fd761c0c788d0f69c4c604191ddb64ff1-7012560-images-thumbs&n=13", "25");
        Basic panel3 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=b486af573dd74bce745aa6648b37a50e31f604a1-2772079-images-thumbs&n=13", "33");
        Basic panel4 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=41cac3c67cc9ca6e0c2d1af9208d49c2aa027bf8-6994724-images-thumbs&n=13", "11");
        Basic panel5 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=3ffb3856b86f48202c8cbaad636499f4-5118143-images-thumbs&n=13", "19");
        Basic panel6 = new Basic(400, 400, "https://avatars.mds.yandex.net/i?id=77fb9f48c50b11b718ae607ef2ee9a06-5888219-images-thumbs&n=13", "22");


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

        all.setOpaque(false);
        add(all);
        setVisible(true);
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
