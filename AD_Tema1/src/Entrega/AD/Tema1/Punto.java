package Entrega.AD.Tema1;

public class Punto {
    protected int iX;
    protected int iY;

    public Punto(int X, int Y) {
        this.iX = X;
        this.iY = Y;
    }

    public double distancia(Punto punto) {
        int distancia = (this.iX - punto.iX) * (this.iX - punto.iX);
        double res = Math.sqrt(distancia);
        return res;
    }
}

