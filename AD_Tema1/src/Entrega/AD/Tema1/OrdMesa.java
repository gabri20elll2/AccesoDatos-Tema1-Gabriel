package Entrega.AD.Tema1;

public class OrdMesa extends Ordenadores {
    protected String sTipo;

    public OrdMesa(int iCodigo, int iRam, String sCPU, double dPrecio, String sTipo) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.sTipo = sTipo;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    public void getCaracteristica() {
        super.getCaracteristicas();
        System.out.println("Tipo: " +this.sTipo);

    }

    @Override
    public String toString() {
        return "OrdMesa [sTipo=" + sTipo + "]";
    }

}