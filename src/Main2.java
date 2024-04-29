/**
 * Let's play with strings
 *
 * EXPLANATION:
 *
 * 1) The coding exercise consist on discarding elements within a list depending on:
 *      - Element length
 *      - Element's first letter
 *      - Sorting the new filtered list
 *
 * 2) Output MUST be similar to example below
 *
 * 3) You cannot erase anything that's already part of the exercise (main class, main method)
 *
 * 4) No restrictions on the amount/names of private methods you can create within the class, as long as names are descriptive or JDoc is included
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    /**
     * Main, executable method
     * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
     * @param   args
     */
    public static void main(String args[]) {
        String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert", "Connie" };
        System.out.println("Let's begin...");

        List<String> nombres = Arrays.asList(testStrings);

        largertThan(nombres, 4, "A");
        equalOrLarger(nombres, 3, "B");
        equalOrLarger(nombres, 5, "C");

    }

    private static String equalOrLarger(List<String> nombres, int nameLength, String startWith){
        List<String> filteredList = nombres.stream().filter(x -> x.startsWith(startWith)).filter(x -> x.length()>=nameLength).sorted().collect(Collectors.toList());
        StringBuilder mensaje = new StringBuilder("Sorted & filtered names with " + startWith + " equal or larger than " + nameLength + " characters: [");

        for (int i = 0; i < filteredList.size(); i++){
            mensaje.append(filteredList.get(i));
            if(i < filteredList.size()-1){
                mensaje.append(", ");
            }
        }

        mensaje.append("]");
        String response = mensaje.toString();
        System.out.println(mensaje);

        return response;
    }

    private static String largertThan (List<String> nombres, int nameLength, String startWith){
        List<String> filteredList = nombres.stream().filter(x -> x.startsWith(startWith)).filter(x -> x.length()>nameLength).sorted().collect(Collectors.toList());
        StringBuilder mensaje = new StringBuilder("Sorted & filtered names with " + startWith + " larger than " + nameLength + " characters: [");

        for (int i = 0; i < filteredList.size(); i++){
            mensaje.append(filteredList.get(i));
            if(i < filteredList.size()-1){
                mensaje.append(", ");
            }
        }

        mensaje.append("]");
        String response = mensaje.toString();
        System.out.println(mensaje);

        return response;
    }

    // YOU CAN ADD MORE PRIVATE METHODS HERE, IF NEEDED!

}

/**
 * EXPECTED OUTPUT WHEN MAIN IS EXECUTED:
 * ======================================
 * Original collection: [Bernard, Charlie, Angie, Andy, Bertha, Annie, Carl, Connie, Caroline, Bob, Betty, Bart, Albert]
 * Sorted & filtered names with A larger than 4 characters: [Albert, Angie, Annie]
 * Sorted & filtered names with B equal or larger than 3 characters: [Bart, Bernard, Bertha, Betty, Bob]
 * Sorted & filtered names with C equal or larger than 5 characters: [Caroline, Charlie, Connie]
 */
