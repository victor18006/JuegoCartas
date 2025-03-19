import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    public Carta devolverCarta(int indice) {
        if (indice >= 0 && indice < mano.size()) {
            return mano.remove(indice);
        }
        return null;
    }

    public void mostrarMano() {
        System.out.println(nombre + " tiene:");
        if (mano.isEmpty()) {
            System.out.println("Sin cartas.");
        } else {
            mano.forEach(System.out::println);
        }
    }

    public String getInformacionJugador() {
        return nombre + " tiene " + mano.size() + " cartas: " + mano;
    }
}