package Entrega.AD.Tema1;

public class ParkingTestGabriel {
    public static void main(String[] args) {
        System.out.println("Inicio ParkingTest");
        try{
            Vehiculo coche1 = new Vehiculo("1234LZP");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 1 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}