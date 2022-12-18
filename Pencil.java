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
        Basic panel1 = new Basic(400, 400, "https://www.ukazka.ru/img/g/uk965753.jpg", "17");
        Basic panel2 = new Basic(400, 400, "https://artmarker.ru/upload/resize_cache/iblock/c1b/700_700_0/c1bccf2a39c634c9545872f9cfcad52b.jpeg", "25");
        Basic panel3 = new Basic(400, 400, "https://avatars.mds.yandex.net/get-mpic/2991631/img_id8249381499784622116.jpeg/orig", "33");
        Basic panel4 = new Basic(400, 400, "https://do-sketch.ru/wa-data/public/shop/products/52/20/32052/images/24123/24123.970.png", "11");
        Basic panel5 = new Basic(400, 400, "https://krasniykarandash.ru/upload/resize/618091/618091_800x800x70.jpg", "19");
        Basic panel6 = new Basic(400, 400, "https://kalem-kanc.ru/image/catalog/relef/karandashi-tsvetnye-professionalnye-klassicheskie/IMGbc3931e5defee206eec3f8cd5454143d.jpg", "22");


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
