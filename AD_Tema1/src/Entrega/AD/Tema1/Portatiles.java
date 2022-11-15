package Entrega.AD.Tema1;

public class Portatiles extends Ordenadores {
    protected double dPeso;

    public Portatiles(int iCodigo, int iRam, String sCPU, double dPrecio, double peso) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.dPeso = peso;
    }

    public double getPeso() {
        return dPeso;
    }

    public void setPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    public void getCaracteristica() {
        super.getCaracteristicas();
        System.out.println("Peso: " + this.dPeso);

    }

    @Override
    public String toString() {
        return "Portatiles [peso=" + dPeso + "]";
    }

}