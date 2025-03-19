public class Juego {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador jugador1 = new Jugador("Mary");
        Jugador jugador2 = new Jugador("Mario");

        jugador1.recibirCartas(mazo.repartir(5));
        jugador2.recibirCartas(mazo.repartir(5));

        System.out.println("Manos de los jugadores: ");
        jugador1.mostrarMano();
        jugador2.mostrarMano();

        System.out.println("\nCartas restantes en el mazo: " + mazo.getCantidadCartas());
        mazo.mostrarMazo();

        // Devolvemos una carta del jugador 1 al mazo
        Carta cartaDevuelta = jugador1.devolverCarta(0);
        mazo.agregarCarta(cartaDevuelta);

        System.out.println("\nDespués de devolver una carta:");

        System.out.println("Cartas restantes en el mazo: " + mazo.getCantidadCartas());
        mazo.mostrarMazo();
    }
}