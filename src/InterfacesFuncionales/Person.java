package InterfacesFuncionales;

public class Person {
    String nombre;
    int edad;



    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
