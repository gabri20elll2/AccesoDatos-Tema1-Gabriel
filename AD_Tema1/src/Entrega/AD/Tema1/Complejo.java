package Entrega.AD.Tema1;
/**
 * Complejo
 */
public class Complejo {
    //ATRIBUTOS
    Double dPReal;
    Double dPImag;

   //CONTRUCTOR
    public Complejo(Double dPReal, Double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    // METODOS
    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;

    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        double dSumaReal;
        double dSumaImag;

        dSumaReal = this.dPReal + c1.dPReal;
        dSumaImag = this.dPImag + c1.dPImag;
        Complejo Result = new Complejo(dSumaReal, dPImag);
        return Result;
    }

    public void imprimir() {
        System.out.println(" Parte real: " +dPReal.toString() + "  Parte imaginaria: " +dPImag.toString());
    }

    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    }

}