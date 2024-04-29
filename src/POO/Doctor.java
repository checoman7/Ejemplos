package POO;

import java.sql.SQLOutput;

public class Doctor extends Persona{

    public Doctor(int peso, String nombre, int altura) {
        super(peso, nombre, altura);
    }

    @Override
    public void correr() {
        System.out.println("El doctor esta corriendo");
    }

    @Override
    public void gritar() {
        System.out.println("El doctor esta gritando");
    }

    @Override
    public void dormir() {
        System.out.println("El doctor esta durmiendo");
    }
}
