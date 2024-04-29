package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsoPersona {

    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Ricky", 1);
        Doctor d2 = new Doctor(1, "Jorge", 1);
        Doctor d3 = new Doctor(1, "Daniel", 1);
        Doctor d4 = new Doctor(1, "Mariela", 1);

        List<Doctor> doctores = new ArrayList<>();

        doctores.add(d1);
        doctores.add(d2);
        doctores.add(d3);
        doctores.add(d4);

        List<Doctor> listaFiltrada = doctores.stream().filter(x -> x.nombre.contains("a")).collect(Collectors.toList());
        listaFiltrada.forEach(x -> System.out.println(x.nombre));

        doctores.forEach(x -> x.correr());

        }

        //Economista e1 = new Economista();


        //miMetodo(d1);
        //miMetodo(e1);

}

/*    public static void miMetodo(Persona p1){
        p1.correr();
        p1.dormir();
        p1.gritar();
    }*/

