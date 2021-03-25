package graficacion_unidad1_t1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AreaDeDibujo extends JPanel {

    public static int RPX, RPY;
    public static int OPX, OPY;
    public static int CPX, CPY;

    public static void drawRectangulo(Graphics g, int e) {
        g.setColor(Color.magenta);
        g.fillRect(RPX, RPY, 80, 40);
        RPY += 40 + e;
    }

    public static void drawOvalo(Graphics g, int e) {
        g.setColor(Color.CYAN);
        g.fillOval(OPX, OPY, 30, 50);
        OPY += 50 + e;
    }

    public static void drawCirculo(Graphics g, int e) {
        g.setColor(Color.red);
        g.fillOval(CPX, CPY, 50, 50);
        CPY += 50 + e;
    }

    public AreaDeDibujo() {
        RPX = 100;
        RPY = 50;
        OPX = 220;
        OPY = 50;
        CPX = 290;
        CPY = 50;
        setBackground(Color.white);
        setLocation(0, 0);
        setSize(450, 600);
    }

    public void Limpiar() {
        RPY = 50;
        OPY = 50;
        CPY = 50;
    }
}
