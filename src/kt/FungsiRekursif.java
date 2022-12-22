package kt;

import java.util.Scanner;

public class FungsiRekursif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = scanner.nextInt();
        System.out.println("Anda memasukan nilai : " + nilai);

//        loopingNumber(nilai);

        int nilai2= factorial(nilai);
        System.out.println(nilai2);
    }

    public static void loopingNumber(int value) {

        if (value == 0) {
            return;
        }
        System.out.println(value);
        loopingNumber(value - 1);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * factorial(value - 1);
        }
    }
}
