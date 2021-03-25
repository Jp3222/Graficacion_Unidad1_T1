package graficacion_unidad1_t1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener {

    private AreaDeDibujo A;
    private JPanel contenedor;
    private JButton jbtRectangulo, jbtOvalo, jbtCirculo, jbtLimpiar;

    public Ventana() {
        Ventana();
        inicomponents();
        Panel();
    }

    private void Ventana() {
        setTitle("Graficos en java");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBackground(Color.lightGray);
    }

    private void inicomponents() {
        A = new AreaDeDibujo();
        jbtRectangulo = new JButton("Rectangulo");
        jbtRectangulo.setBounds(A.getSize().width + 20, 50, 100, 25);
        jbtOvalo = new JButton("Ovalo");
        jbtOvalo.setBounds(A.getSize().width + 20, 95, 100, 25);
        jbtCirculo = new JButton("Circulo");
        jbtCirculo.setBounds(A.getSize().width + 20, 145, 100, 25);
        jbtLimpiar = new JButton("Limpiar");
        jbtLimpiar.setBounds(A.getSize().width + 20, 190, 100, 25);

    }

    private void Panel() {
        contenedor = new JPanel(null);
        contenedor.setBackground(Color.gray);
        contenedor.add(A);
        contenedor.add(jbtRectangulo);
        contenedor.add(jbtOvalo);
        contenedor.add(jbtCirculo);
        contenedor.add(jbtLimpiar);
        jbtRectangulo.addActionListener(this);
        jbtOvalo.addActionListener(this);
        jbtCirculo.addActionListener(this);
        jbtLimpiar.addActionListener(this);
        setContentPane(contenedor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtRectangulo) {
            AreaDeDibujo.drawRectangulo(A.getGraphics(), 30);
        } else if (e.getSource() == jbtOvalo) {
            AreaDeDibujo.drawOvalo(A.getGraphics(), 30);
        } else if (e.getSource() == jbtCirculo) {
            AreaDeDibujo.drawCirculo(A.getGraphics(), 30);
        } else if (e.getSource() == jbtLimpiar) {
            A.Limpiar();
            A.repaint();
        }
    }

}
