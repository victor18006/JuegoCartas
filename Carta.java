public class Carta {
    private int valor;
    private Palo palo;

    public Carta(Palo palo, int valor) {
        this.valor = valor;
        this.palo = palo;
    }

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        return "[" + valores[valor - 1] + " de " + palo + "]";
    }
}