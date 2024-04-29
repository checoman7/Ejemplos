public class Binario {

    public static void main(String[] args) {

        int[] binario = {1, 0, 0, 1, 0, 1, 0, 1};

        double numero = 0;

        for (int i = 0; i < binario.length; i++){
            if (binario[i] == 1){
                numero = numero + Math.pow(2, binario.length - 1 - i);
            }
        }
        System.out.println(numero);

    }
}
