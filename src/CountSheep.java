public class CountSheep {

    public static void main(String[] args) {
        int numero = 4;

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= numero; i++){

            builder.append(i + " sheep...");

        }

        String murmur = builder.toString();

        System.out.println(murmur);
    }
}
