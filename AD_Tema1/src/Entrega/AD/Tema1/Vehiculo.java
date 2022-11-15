package Entrega.AD.Tema1;
import java.time.LocalDateTime;

public class Vehiculo {
    // ATRIBUTOS
    protected String sMatricula;
    protected LocalDateTime fechaIni;
    protected LocalDateTime fechaFin;

    public Vehiculo(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public Vehiculo(String sMatricula, LocalDateTime fechaIni, LocalDateTime fechaFin) {
        this.sMatricula = sMatricula;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    public String getMatricula() {
        return sMatricula;
    }
    public void setMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }
    public LocalDateTime getFechaIni() {
        return fechaIni;
    }
    public void setFechaIni(LocalDateTime fechaIni) {
        this.fechaIni = fechaIni;
    }
    public LocalDateTime getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [sMatricula=" + sMatricula + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + "]";
    } 

    
}
