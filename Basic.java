package ITProject;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Basic extends JPanel {

    public Basic(int width, int height, String name_frame) {

        setSize(new Dimension(width, height - 50));

        setBackground(new Color(148, 161, 189));

        Pens pens = new Pens();
        Ruler ruler = new Ruler();
        Pencil pencil = new Pencil();
        Paper paper = new Paper();
        Paints paints = new Paints();
        Others others = new Others();
        Notebooks notebooks = new Notebooks();
        MainFrame mainFrame = new MainFrame();
        Glue glue = new Glue();
        ForChildren forChildren = new ForChildren();
        Discounts discounts = new Discounts();
        Backpack backpack = new Backpack();

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        JPanel mane_panel = new JPanel();

        if (Objects.equals(name_frame, "Pens")) {
            mane_panel.add(pens);
        }
        if (name_frame == "Ruler") {
            mane_panel.add(ruler);
        }
        if (name_frame == "Pencil") {
            mane_panel.add(pencil);
        }
        if (name_frame == "Paper") {
            mane_panel.add(paper);
        }
        if (name_frame == "Paints") {
            mane_panel.add(paints);
        }
        if (name_frame == "Others") {
            mane_panel.add(others);
        }
        if (name_frame == "Notebooks") {
            mane_panel.add(notebooks);
        }
        if (name_frame == "MainFrame") {
            mane_panel.add(mainFrame);
        }
        if (name_frame == "Glue") {
            mane_panel.add(glue);
        }
        if (name_frame == "ForChildren") {
            mane_panel.add(forChildren);
        }
        if (name_frame == "Discounts") {
            mane_panel.add(discounts);
        }
        if (name_frame == "Backpack") {
            mane_panel.add(backpack);
        }


        setVisible(true);
    }

}