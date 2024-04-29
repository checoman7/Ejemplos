import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeraLista {

    public static void main(String[] args) {

        ArrayList <String> listaHermanos = new ArrayList<>();

        listaHermanos.add("Ricardo");
        listaHermanos.add("Jorge");
        listaHermanos.add("Sergio");
        listaHermanos.add("Daniel");
        listaHermanos.add("Mariela");

        // for each, stream, sort

//        for (int i = 0; i < listaHermanos.size(); i++) {
//            System.out.println(listaHermanos.get(i));
//        }

//        for (String listaHermano : listaHermanos) {
//            System.out.println(listaHermano);
//        }

//        listaHermanos.forEach(lista -> {
//
//            System.out.println("Los hermanos son: ");
//            System.out.println(lista);
//
//        });

//        Collections.sort(listaHermanos, Collections.reverseOrder());
//                listaHermanos.forEach(lista -> {
//
//            System.out.println("Los hermanos son: ");
//            System.out.println(lista);
//
//        });

//        List listaFiltrada = listaHermanos.stream().filter(s -> s.contains("a") && s.endsWith("l")).collect(Collectors.toList());
//
//        listaFiltrada.forEach(l -> System.out.println(l));

    }
}
