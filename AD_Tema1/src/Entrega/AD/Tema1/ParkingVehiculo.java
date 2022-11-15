package Entrega.AD.Tema1;

import java.time.LocalDateTime;


public class ParkingVehiculo implements Parking {
    //CONSTANTES
    protected static double dPrecioMin = 0.0425;
    protected static int iPlazasMax = 100;

    //ATRIBUTOS
    protected String sDireccion;
    protected int iPlazasOcupadas;

    public ParkingVehiculo(String sDireccion) {
        this.sDireccion = sDireccion;

    }

    @Override
    public boolean hayPlaza() throws Exception {
        return iPlazasOcupadas < iPlazasMax ? true : false;
    }

    @Override
    public void aparcaCoche(Vehiculo coche) throws Exception {
        if (hayPlaza()) {
            iPlazasOcupadas++;
            coche.setFechaIni(LocalDateTime.now());
        } else {
            throw new Exception("0 plaza de disponible");
        }

    }
    @Override
    public void sacaCoche(Vehiculo coche) throws Exception {
        if (coche.getFechaIni() != null) {
            iPlazasOcupadas--;
            coche.setFechaFin(LocalDateTime.now());
        } else {
            throw new Exception("Error al aparcar coche");

        }

    }
    @Override
    public double getFactura(Vehiculo coche) throws Exception {
      
        double factura = 0.0;
        if (dPrecioMin != 0) {
            factura = dPrecioMin;
        }
        return factura;
    }

    @Override
    public String toString() {
        return "ParkingVehiculo [sDireccion=" + sDireccion + ", iPlazasOcupadas=" + iPlazasOcupadas + "]";
    }
    
}