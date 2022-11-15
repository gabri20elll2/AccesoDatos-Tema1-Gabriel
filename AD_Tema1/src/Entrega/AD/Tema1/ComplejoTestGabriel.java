package Entrega.AD.Tema1;

public class ComplejoTestGabriel {

    public static void main(String[] args) {
        OrdMesa OrdenMesa =  new OrdMesa(445674, 16, "AMD", 225, "Workstation");
        System.out.println(OrdenMesa.toString());
        OrdenMesa.getCaracteristicas();
        System.out.println(OrdenMesa.toString());

        System.out.println("");
        
        Portatiles CaPortatiles =  new Portatiles(4444888, 8, "AMD", 88, 400);
        System.out.println(CaPortatiles.toString());
        CaPortatiles.getCaracteristica();
        System.out.println(CaPortatiles.toString());
    }
}
