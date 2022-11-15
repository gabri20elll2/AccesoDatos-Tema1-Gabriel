package Entrega.AD.Tema1;

public class Ordenadores {
    protected int iCodigo;
    protected int iRam;
    protected String sCPU;
    protected double dPrecio;

    public Ordenadores(int iCodigo, int iRam, String sCPU, double dPrecio) {
        this.iCodigo = iCodigo;
        this.iRam = iRam;
        this.sCPU = sCPU;
        this.dPrecio = dPrecio;
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public void setiRam(int iRam) {
        this.iRam = iRam;
    }

    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public void getCaracteristicas() {
        System.out.println("Caracteristicas: ");
        System.out.println("Codigo: " + this.iCodigo);
        System.out.println("RAM: " + this.iRam);
        System.out.println("CPU: " + this.sCPU );
        System.out.println("Precio: " + this.dPrecio);
    }
}