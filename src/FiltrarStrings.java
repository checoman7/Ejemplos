import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarStrings {

    //Dada una lista de cadenas, utiliza filter() para generar una lista de cadenas que empiecen
    // con la letra "A" (o cualquier otra letra que elijas) y luego usa forEach() para imprimir
    // cada cadena de la lista filtrada.

    public static void main(String[] args) {

        String[] palabrasRandom = {"refresco", "gente", "verdura", "silla", "postre", "nachos", "botana", "sobrino", "lata", "bienvenido", "bebida"};
        List<String> palabrasParaFiltrar = Arrays.asList(palabrasRandom);

        filtrarPalabras(palabrasParaFiltrar, "s");
        filtrarPalabras(palabrasParaFiltrar, "b");
        filtrarPalabras(palabrasParaFiltrar, "x");
    }

    private static void filtrarPalabras(List<String> palabras, String startsWith) {

        palabras.stream().filter(x->x.startsWith(startsWith)).collect(Collectors.toList()).forEach(x-> System.out.println(x));
    }
}