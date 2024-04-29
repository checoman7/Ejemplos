package POO;

public class Economista extends Persona{


    public Economista(int peso, String nombre, int altura) {
        super(peso, nombre, altura);
    }

    @Override
    public void correr() {
        System.out.println("El economista nunca corre");
    }

    @Override
    public void gritar() {
        System.out.println("El economista grita todos los dias");
    }

    @Override
    public void dormir() {
        System.out.println("El economista esta durmiendo");
    }
}
