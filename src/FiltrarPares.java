import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarPares {

    //Dada una lista de enteros, utiliza filter() para seleccionar los números mayores que 5.
    // Luego, con map(), multiplica cada número filtrado por 2.
    // Finalmente, usa forEach() para imprimir cada elemento del stream resultante.

    public static void main(String[] args) {

        Integer[] numerosRandom = {1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 8, 8, 9};
        List<Integer> numerosParaOrdenar = Arrays.asList(numerosRandom);

        filtrarPares(numerosParaOrdenar);
    }
    private static void filtrarPares(List<Integer> numerosRandom) {

        List<Integer> listaFiltrada = numerosRandom.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        listaFiltrada.forEach(x-> System.out.println(x));
    }
}
