package POO;

public abstract class Persona {

    private int peso;
    public String nombre;
    private int altura;

    public Persona(int peso, String nombre, int altura) {
        this.peso = peso;
        this.nombre = nombre;
        this.altura = altura;
    }

    public abstract void correr();
    public abstract void gritar();
    public abstract void dormir();

}
