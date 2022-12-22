package kt;

import java.util.Arrays;

public class BelajarArrayOperasi {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi String
        System.out.println("Merubah Array menjadi String");
        printArray(arrayAngka1);

        // mengcopy array
        System.out.println("\nMengcopy Array");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        // copyOf
        System.out.println("\nMengcopy dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,5);
        printArray(arrayAngka1);
        printArray(arrayAngka3);

        // copyOfRange
        System.out.println("\nMengcopy array dengan copyOFRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2,6);
        System.out.println(arrayAngka1);
        printArray(arrayAngka1);
        System.out.println(arrayAngka4);
        printArray(arrayAngka4);

        // Fill Array
        System.out.println("\nFill Array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,1);
        printArray(arrayAngka5);

        // Komparasi Array
        System.out.println("\nKomparasi Array");
        int[] arrayAngka6 = {1,2,3,4,5,6};
        int[] arrayAngka7 = {9,2,3,4,5,6};

        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        // Cek >
        System.out.println("\nNgecek mana array yang lebih besar perkomponen");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        // Cek
        System.out.println("\nMana Index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // Sorting
        System.out.println("\nSort Array");
        int[] arrayAngka8 = {1,2,5,7,9,3,8,9};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // Search
        System.out.println("\nBinary Search Array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);


    }

    private static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
