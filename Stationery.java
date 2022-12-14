package ITProject;
import java.awt.*;
import javax.swing.JComponent;
public abstract class Stationery extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       // Image image = Toolkit.getDefaultToolkit().createImage("https://img.freepik.com/free-photo/boxes-with-gifts-christmas-decorations-blue-surface_127032-2004.jpg?w=996&t=st=1670335922~exp=1670336522~hmac=1e26e0ccb14772b6359335486c396b43536f1dfdb180772b575e00ffe490dd87");
        //g.drawImage(image, 1, 1, this);
        paintStationery(g);
    }
    protected abstract void paintStationery(Graphics g);
    public abstract String getButtonName();
}
