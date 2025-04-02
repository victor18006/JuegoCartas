import java.awt.*;

public class Triangulo extends Triangle {

    public Triangulo() {
        super();
    }

    public void posicionEspecifica(int newxPosition, int newyPosition) {
        moveHorizontal(newxPosition - getXPosition());
        moveVertical(newyPosition - getYPosition());
    }
    
    public void girar() {
        if (isVisible()) {
            Canvas canvas = Canvas.getCanvas();

            // Intercambiar la posición del vértice superior con la base
            int[] xpoints = { getXPosition(), getXPosition() - (getWidth() / 2), getXPosition() + (getWidth() / 2) };
            int[] ypoints = { getYPosition() + getHeight(), getYPosition(), getYPosition() };

            canvas.draw(this, getColor(), new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }
    
    private int getXPosition() {
        return super.xPosition;
    }

    private int getYPosition() {
        return super.yPosition;
    }

    private int getWidth() {
        return super.width;
    }

    private int getHeight() {
        return super.height;
    }

    private String getColor() {
        return super.color;
    }

    private boolean isVisible() {
        return super.isVisible;
    }
}