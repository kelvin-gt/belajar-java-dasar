package kt;

import java.util.Scanner;

public class LatihanAritmatikaScanner {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int panjang,lebar,luas, tinggi, volume;

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("luas persegi panjang = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);

    }
}
