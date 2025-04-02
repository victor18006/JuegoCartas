public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        // Crear el cuadrado que representará la carta
        Cuadrado cuadradoA = new Cuadrado();
        Cuadrado cuadradoAb = new Cuadrado();

        cuadradoAb.changeColor("black");
        cuadradoA.changeColor("white");
        
        cuadradoA.posicionEspecifica(p.getX(), p.getY());
        cuadradoAb.posicionEspecifica(p.getX()-1, p.getY()-1);
        cuadradoA.changeSize(100);
        cuadradoAb.changeSize(102);

        cuadradoAb.makeVisible();
        cuadradoA.makeVisible();

        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado();
        Cuadrado cuadrado3 = new Cuadrado();
        
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        switch (c.getPalo()) {
            case CORAZONES:
            cuadrado1.changeColor("red");
            cuadrado2.changeColor("red");
            cuadrado3.changeColor("red");

            cuadrado1.changeSize(20);
            cuadrado2.changeSize(20);
            cuadrado3.changeSize(20);

            cuadrado1.posicionEspecifica(p.getX()+50, p.getY()+50);
            cuadrado2.posicionEspecifica(p.getX()+30, p.getY()+50);
            cuadrado3.posicionEspecifica(p.getX()+40, p.getY()+35);
            
            cuadrado1.makeVisible();
            cuadrado2.makeVisible();
            cuadrado3.makeVisible();
                break;

            case DIAMANTES:
            triangulo1.changeColor("red");
            triangulo2.changeColor("white");

            triangulo1.changeSize(40,40);
            triangulo2.changeSize(20,20);

            

            triangulo1.posicionEspecifica(p.getX()+50, p.getY()+30);
            triangulo2.posicionEspecifica(p.getX()+50, p.getY()+50);
            
            triangulo1.makeVisible();
            triangulo2.makeVisible();
            triangulo2.girar();
                break;

            case TREBOLES:
            cuadrado1.changeColor("black");
            cuadrado2.changeColor("black");
            cuadrado3.changeColor("black");

            cuadrado1.changeSize(20);
            cuadrado2.changeSize(20);
            cuadrado3.changeSize(20);

            cuadrado1.posicionEspecifica(p.getX()+50, p.getY()+50);
            cuadrado2.posicionEspecifica(p.getX()+30, p.getY()+50);
            cuadrado3.posicionEspecifica(p.getX()+40, p.getY()+35);
            
            cuadrado1.makeVisible();
            cuadrado2.makeVisible();
            cuadrado3.makeVisible();
                break;

            case PICAS:
            triangulo1.changeColor("black");
            triangulo2.changeColor("white");

            triangulo1.changeSize(40,40);
            triangulo2.changeSize(20,20);

            triangulo1.posicionEspecifica(p.getX()+50, p.getY()+30);
            triangulo2.posicionEspecifica(p.getX()+50, p.getY()+50);
            
            triangulo1.makeVisible();
            triangulo2.makeVisible();
            triangulo2.girar();
                break;
            default:
                break;
        }
        }
    }