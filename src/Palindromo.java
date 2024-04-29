import javax.swing.*;

public class Palindromo {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Introduce un texto");
        String transforma = input.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").toLowerCase();
        StringBuilder reversa = new StringBuilder();


        reversa.append(transforma);
        reversa.reverse();


        System.out.println(reversa);
        System.out.println(transforma);

        if (transforma.equals(reversa.toString())) {
            System.out.println("Si es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }

    }

}
