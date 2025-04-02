public class Juego {
    public static void main(String[] args) {
        /*Mazo mazo = new Mazo();
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
        mazo.mostrarMazo();*/
        Carta carta1 = new Carta(Palo.CORAZONES, 1); // Ajusta a tu implementación del enum Palo
        Carta carta2 = new Carta(Palo.TREBOLES, 10); // Ajusta a tu implementación del enum Palo
        Visualizador.carta(carta1, new Posicion(100, 100));
        Visualizador.carta(carta2, new Posicion(250, 100));
        int sum = 0;
int i = 0;

while (i < 5) {
    sum = sum + i;
    i++;
}
System.out.println(sum);

    }
}