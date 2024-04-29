public class Producto {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};

        int producto = 1;

        for (int i = 0; i < array1.length; i++){

            producto = producto * array1[i];

        }

        System.out.println(producto);
    }
}
