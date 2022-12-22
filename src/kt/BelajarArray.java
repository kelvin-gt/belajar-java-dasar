package kt;

import java.util.Arrays;

public class BelajarArray {
    public static void main(String[] args) {

        System.out.println("Assignment Array");
        // Asignment
        // tipedata [] nama = {komponen2x}
        //           index =  0 1 2 3
        //                    | | | |
        int[] arrayInteger = {1,2,3,4};

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("Deklarasi Array");
        // Deklarasi
        // tipedata [] nama = new int[jumlah array];

        float[] arrayFloats = new float[5];

        arrayFloats[3] = 11;

        System.out.println(arrayFloats[0]);
        System.out.println(arrayFloats[1]);
        System.out.println(arrayFloats[2]);
        System.out.println(arrayFloats[3]);
        System.out.println(arrayFloats[4]);

        System.out.println(Arrays.toString(arrayInteger));
    }
}
