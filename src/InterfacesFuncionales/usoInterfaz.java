package InterfacesFuncionales;




import java.util.Arrays;
import java.util.List;

import static InterfacesFuncionales.ArrayList2.filtrarLista;

public class usoInterfaz {
    public static void main(String[] args) {
        List<Person> personas = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25),
                new Person("Dave", 32)
        );

        List<Person> mayoresDe25 = filtrarLista(personas, persona -> persona.edad > 25);

        mayoresDe25.forEach(System.out::println);
    }
}
