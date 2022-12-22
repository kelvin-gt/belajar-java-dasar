package kt;

import java.util.Arrays;

public class BelajarArrayOperasi2 {
    public static void main(String[] args) {

        // penjumlahan dua buah array
        int[] arrayAngka1 = {3,2,1,6,5,7,9,8};
        int[] arrayAngka2 = {1,2,3,4,5,3,1,2};

        // array hasil penjumlahan
        int[] arrayHasil1 = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1, "array angka1");
        printArray(arrayAngka2, "array angka2");
        printArray(arrayHasil1, "Hasil");

        // penggabungan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        System.out.println();
        printArray(arrayAngka1, "array angka1");
        printArray(arrayAngka2, "array angka2");
        printArray(arrayHasil2, "Hasil");

        // Sorting / reverse array 1
        System.out.println();
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka1, "array angka1");

        reverse(arrayAngka1);
        printArray(arrayAngka1, "array angka1");

        // Sorting / reverse array 2
        System.out.println();
        printArray(arrayAngka2, "array angka2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "array angka2");


    }

    // reverse lbh cepat dgn 1/2 data untuk data array yang besar
    private static void reverse2(int[] dataArray) {
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < (dataArray.length /2); i++) {
            // data array yang di depan jd patokan
            buffer = dataArray[i];
            // data array didepan diisi dari data array yg blakang
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            // data array diblkg diisi dari data array yg depan
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    // reverse standard
    private static void reverse(int[] dataArray) {
        Arrays.sort(dataArray);

        int[] arrayBuffer = Arrays.copyOf(dataArray,dataArray.length);

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }

    }

    // Method tambah array
    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];

        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    // Method arrays to string
    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
