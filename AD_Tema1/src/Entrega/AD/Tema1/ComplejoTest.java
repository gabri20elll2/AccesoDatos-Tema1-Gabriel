package Entrega.AD.Tema1;

public class ComplejoTest {

    public static void main(String[] args) {
        Complejo comp =  new Complejo(0.0, 0.0);
        System.out.println(comp.toString());
        comp.asignar(29, 14);
        System.out.println(comp.toString());

    }

}