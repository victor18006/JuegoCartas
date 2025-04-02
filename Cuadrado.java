public class Cuadrado extends Square {
    
    public Cuadrado() {
        super();
    }

    public void posicionEspecifica(int newxPosition, int newyPosition) {
        super.xPosition = newxPosition;
        super.yPosition = newyPosition;
    }

    @Override
    public void changeSize(int newSize) {
        super.size = newSize;
    }

    @Override
    public void changeColor(String newColor) {
        super.color = newColor;
    }
}