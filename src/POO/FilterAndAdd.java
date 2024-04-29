package POO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndAdd {

    //Dada una lista de enteros, utiliza filter() para seleccionar solo los números impares
    // y luego usa reduce() para sumarlos. Este ejercicio te muestra cómo filtrar elementos
    // y luego combinar los resultados.)

    public static void main(String[] args) {

        Integer[] numerosRandom = {1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 8, 8, 9};
        List<Integer> numerosParaFiltrar = Arrays.asList(numerosRandom);

        filterAndAdd(numerosParaFiltrar);

    }

    private static void filterAndAdd(List<Integer> numeros) {

        int total = numeros.stream().filter(x -> x % 2 != 0).reduce(0, (x, y) -> x + y);
        System.out.println("Total: " + total);
    }
}
