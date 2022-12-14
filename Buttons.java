package ITProject;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JPanel{
    JMenu MainFrame = new JMenu("Главная");
    JMenu Pens = new JMenu("Ручки");
    JMenu Pencil = new JMenu("Карандаши");
    JMenu Ruler = new JMenu("Линейки");
    JMenu Backpack = new JMenu("Портфели");
    JMenu Notebooks = new JMenu("Тетради");
    JMenu Paints = new JMenu("Краски");
    JMenu Paper = new JMenu("Бумага");
    JMenu Glue = new JMenu("Клей");
    JMenu ForChildren = new JMenu("Для детей");
    JMenu Others = new JMenu("Разное");
    JMenu Discounts = new JMenu("Акции");



    public Buttons(int width, int height, ShopProject frame){

        setPreferredSize(new Dimension(width, 200));
        setBackground(new Color(25, 47, 90));
        JMenuBar menu = new JMenuBar();

        menu.setMaximumSize(new Dimension(width, 200));
/*
        // связываем кнопки с обработчиком
        MainFrame.addMenuListener(frame);
        Pens.addMenuListener(frame);
        Pencil.addMenuListener(frame);
        Ruler.addMenuListener(frame);
        Backpack.addMenuListener(frame);
        Notebooks.addMenuListener(frame);
        Paints.addMenuListener(frame);
        Glue.addMenuListener(frame);
        ForChildren.addMenuListener(frame);
        Others.addMenuListener(frame);
        Discounts.addMenuListener(frame);

        menu.add(MainFrame);
        menu.add(Pens);
        menu.add(Pencil);
        menu.add(Ruler);
        menu.add(Backpack);
        menu.add(Notebooks);
        menu.add(Paints);
        menu.add(Paper);
        menu.add(Glue);
        menu.add(ForChildren);
        menu.add(Others);
        menu.add(Discounts);

        menu.setBackground(new Color(144, 206, 134));
        add(menu);
        setVisible(true);

    }
    */

}}
