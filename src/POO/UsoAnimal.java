package POO;

public class UsoAnimal {

    public static void main(String[] args) {
        Animal uno = new Gatos(4, "Gato", "naranja", false);

        System.out.println(uno.color);
        System.out.println(uno.dimeCaracteristicas());
        System.out.println(uno.getNumeroDePatas());


        Gatos g1 = new Gatos(4, "Ronald", "naranja", false);
        Gatos g2 = new Gatos(4, "Tuxedo", "blanco y negro", true);

        miMetodo(g1);
        miMetodo(g2);



    }

    public static void miMetodo(Animal any) {
        System.out.println(any.dimeCaracteristicas());
    }

}
