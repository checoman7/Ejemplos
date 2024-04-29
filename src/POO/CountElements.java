package POO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElements {

    //Dada una lista de cadenas, utiliza filter() para contar cuántas cadenas tienen una longitud mayor
    // a 3 caracteres. Aunque no uses directamente forEach() aquí, es un buen ejercicio para entender
    // cómo se pueden combinar las operaciones de stream.

    public static void main(String[] args) {

        String[] palabrasRandom = {"refresco", "gente", "verdura", "silla", "postre", "nachos", "botana", "sobrino", "lata", "bienvenido", "bebida"};
        List<String> palabrasParaFiltrar = Arrays.asList(palabrasRandom);

        countElements(palabrasParaFiltrar, 9);
    }

    private static void countElements(List<String> palabras, int wordLength) {

        List<String> listaFiltrada = palabras.stream().filter(x->x.length()>=wordLength).collect(Collectors.toList());
        System.out.println("There are " + listaFiltrada.size() + " words longer than " + wordLength + " characters." );
    }
}
