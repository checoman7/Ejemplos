package POO;

public class Gatos extends Animal {

    public boolean maulla;

    public Gatos(int numeroDePatas, String nombre, String color, boolean maulla) {
        super(numeroDePatas, nombre, color);
        this.maulla = maulla;
    }

    public String dimeCaracteristicas() {
        String mensaje;

        if (maulla == true) {
            mensaje = "El gato se llama " + getNombre() + ", tiene " + getNumeroDePatas() + " patas y es de color " + color + ". Este gato si maulla.";
        } else {
            mensaje = "El gato se llama " + getNombre() + ", tiene " + getNumeroDePatas() + " patas y es de color " + color + ". Este gato no maulla.";
        }
         return mensaje;
    }

    @Override
    public void correr() {
        System.out.println("El gato esta corriendo.");
    }
}
