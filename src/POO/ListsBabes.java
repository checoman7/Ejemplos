package POO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListsBabes {

    public static void main(String[] args) {
        Integer [] randomNumbers = {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8, 9, 9, 10};
        List<Integer> numeros = Arrays.asList(randomNumbers);
        String [] randomWords = {"refresco", "bebida", "pastel", "brazalete", "lap", "headset", "lata", "botella", "cargador", "telefono", "monitor", "hoodie", "box", "in"};
        List<String> palabras = Arrays.asList(randomWords);

        //filterPairs(numeros);
        //filterWords(palabras, "b");
        //filterTransform(numeros, 5, 2);
        countWords(palabras, 3);
    }

    private static void filterPairs(List<Integer> numeros){
        numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()).forEach(x -> System.out.println(x));
    }

    private static void filterWords(List<String> palabras, String startsWith){
        palabras.stream().filter(x -> x.startsWith(startsWith)).collect(Collectors.toList()).forEach(x -> System.out.println(x));
    }

    private static void filterTransform(List<Integer> numeros, int greaterThan, int multiplyBy){
        numeros.stream().filter(x -> x > greaterThan).map(x -> x * multiplyBy).collect(Collectors.toList()).forEach(x -> System.out.println(x));
    }

    private static void countWords(List<String> palabras, int longerThan){
        List<String> listaFiltrada = palabras.stream().filter(x -> x.length() > longerThan).collect(Collectors.toList());
        System.out.println("Hay " + listaFiltrada.size() + " palabras con mas de " + longerThan + " caracteres.");
    }
}
