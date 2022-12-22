package kt;

import java.util.Arrays;

public class BelajarArray2 {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        // cek memory array
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        // dia akan memberikan reference / addresnya, bkn memberikan nilainya
        arrayAngka2 = arrayAngka1;

        // cek memory array
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("array2 = " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 11;

        System.out.println("array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("array2 = " + Arrays.toString(arrayAngka2));

        arrayAngka2[4] = 400;

        System.out.println("array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("array2 = " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("array2 = " + Arrays.toString(arrayAngka2));
    }

    // method yang argumentnya adalah reference, pass by reference
    // tidak menambah memori baru, tapi pake memori yang sama
    // memori otomatis di java
    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
}
