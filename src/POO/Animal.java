package POO;

public abstract class Animal {
private int numeroDePatas;
private String nombre;
protected String color;


    public Animal(int numeroDePatas, String nombre, String color) {
        this.numeroDePatas = numeroDePatas;
        this.nombre = nombre;
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String dimeCaracteristicas(){
     String mensaje = "El animal se llama " + nombre + ", tiene " + numeroDePatas + " patas y es de color " + color;

        return mensaje;
    }

    public abstract void correr();

}
