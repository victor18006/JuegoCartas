public class Juego {
    public static void main(String[] args) {
        Carta carta1 = new Carta(Palo.DIAMANTES, 1);
        Carta carta2 = new Carta(Palo.TREBOLES, 10);
        Carta carta3 = new Carta(Palo.PICAS, 1);
        Carta carta4 = new Carta(Palo.CORAZONES, 10);
        Visualizador.carta(carta1, new Posicion(100, 100));
        Visualizador.carta(carta2, new Posicion(250, 100));
        Visualizador.carta(carta3, new Posicion(100, 300));
        Visualizador.carta(carta4, new Posicion(250, 300));
    }
}