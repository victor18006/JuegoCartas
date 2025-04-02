import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Visualizador extends JPanel {
    private static ArrayList<Carta> cartas = new ArrayList<>();
    private static ArrayList<Posicion> posiciones = new ArrayList<>();
    private static JFrame frame;

    public Visualizador() {
        setBackground(Color.GREEN); // Fondo de la mesa
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);
            Posicion posicion = posiciones.get(i);

            // Dibujar rectángulo para la carta
            g.setColor(Color.WHITE);
            g.fillRect(posicion.getX(), posicion.getY(), 100, 130);
            g.setColor(Color.BLACK);
            g.drawRect(posicion.getX(), posicion.getY(), 100, 130);

            // Obtener el texto de la carta
            String textoCarta = carta.toString().replace("[", "").replace("]", ""); 
            String[] partes = textoCarta.split(" de ");

            // Dibujar el valor y el palo dentro de la carta
            g.setFont(new Font("Arial", Font.BOLD, 14));
            g.drawString(partes[0], posicion.getX() + 35, posicion.getY() + 60);  // Valor
            g.drawString(partes[1], posicion.getX() + 10, posicion.getY() + 80);  // Palo
        }
    }

    public static void carta(Carta c, Posicion p) {
        cartas.add(c);
        posiciones.add(p);

        if (frame == null) { // Crear la ventana solo una vez
            frame = new JFrame("Cartas en la Mesa");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Visualizador());
            frame.setVisible(true);
        } else {
            frame.repaint(); // Redibujar cuando se agrega una carta nueva
        }
    }
}
