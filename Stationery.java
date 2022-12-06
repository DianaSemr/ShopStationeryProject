package ITProject;
import java.awt.Graphics;
import javax.swing.JComponent;
public abstract class Stationery extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintStationery(g);
    }
    protected abstract void paintStationery(Graphics g);
    public abstract String getButtonName();
}
