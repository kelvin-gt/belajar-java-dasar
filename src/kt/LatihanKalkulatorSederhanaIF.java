package kt;

import java.util.Scanner;

public class LatihanKalkulatorSederhanaIF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a, b, hasil;
        char operator;

        System.out.print("Masukkan nilai pertama : ");
        a = scanner.nextFloat();
        System.out.print("Masukkan operator : ");
        operator = scanner.next().charAt(0);
        System.out.print("Masukkan nilai kedua : ");
        b = scanner.nextFloat();
        System.out.println("User input = " + a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else {
            System.out.println("Operator belum tersedia");
        }
    }
}
