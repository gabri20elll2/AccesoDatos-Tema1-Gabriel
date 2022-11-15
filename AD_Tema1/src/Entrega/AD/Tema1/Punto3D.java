package Entrega.AD.Tema1;

public class Punto3D extends Punto {
    // ATRIBUTO
    protected int iZ;

    // CONTRUCTOR
    public Punto3D(int paramiX, int paramiY, int z) {
        super(paramiX, paramiY);
        this.iZ = z;
    }

    public double distancia(Punto3D punto3d) {
        int distancia = (this.iX - punto3d.iX) + (this.iY - punto3d.iY)
                + (this.iZ - punto3d.iZ);
        double res = Math.sqrt(distancia);
        return res;
    }

    public boolean equals(Punto3D punto3d) {
        return this.iX == punto3d.iX ;
    }

}