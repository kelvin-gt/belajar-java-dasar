package kt;

import java.util.Scanner;

public class LatihanOperatorLogika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukkan nilai tebakkan anda : ");
        nilaiTebakan = scanner.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilaiTebakan);

        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda : " + statusTebakan);

        // Operasi Aljabar Boolean AND / OR
        System.out.print("masukkan nilai diantara 4 dan 9 : ");
        nilaiTebakan = scanner.nextInt();
        statusTebakan = (nilaiTebakan >= 4 && nilaiTebakan <= 9);
        System.out.println("tebakan anda : " + statusTebakan);
    }
}
