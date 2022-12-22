package kt;

import java.util.Arrays;

public class BelajarArrayLooping {
    public static void main(String[] args) {

        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        System.out.println("Looping Standar");
        // looping standar
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println(arrayAngka[i]);
        }

        System.out.println("Looping For Each");
        // looping khusus untuk collection array
        for (int value : arrayAngka) {
            System.out.println(value);
        }
    }
}
