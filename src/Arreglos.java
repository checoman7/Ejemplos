public class Arreglos {

    public static void main (String[] args){
        int[] arreglo1 = {1, 2, 3, 4, 5};
        String[] meGusta2 = {"carne", "leche", "pan"};

        System.out.println(arreglo1[4]);

        for (int i = 0; i < arreglo1.length; i++){
            System.out.println(arreglo1[i]);
        }

        for (String temporal:meGusta2){
            System.out.println(temporal);
        }
    }
}
