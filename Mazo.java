import java.util.*;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        inicializarMazo();
    }

    private void inicializarMazo() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(palo, i));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> repartir(int numCartas) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas && !cartas.isEmpty(); i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta quitarCarta() {
        return !cartas.isEmpty() ? cartas.remove(0) : null;
    }

    public void reiniciarMazo() {
        inicializarMazo();
        barajar();
    }

    public int getCantidadCartas() {
        return cartas.size();
    }

    public void mostrarMazo() {
        System.out.println("Cartas en el mazo (" + cartas.size() + "):");
        cartas.forEach(System.out::println);
    }
}