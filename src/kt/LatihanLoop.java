package kt;

import java.util.Scanner;

public class LatihanLoop {
    public static void main(String[] args) {

        int total = 0;
        int nAwal, nAkhir;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------WHILE");
        System.out.print("Masukkan Nilai Pertama : ");
        nAwal = scanner.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        nAkhir = scanner.nextInt();

        while (nAwal <= nAkhir) {
            total = total + nAwal;
            System.out.println("ditambah " + nAwal + " menjadi " + total);
            nAwal++;
        }

        System.out.println("\n------------------FOR");
        System.out.print("Masukkan Nilai Pertama : ");
        nAwal = scanner.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        nAkhir = scanner.nextInt();

        for (total = 0; nAwal <= nAkhir; nAwal++) {
            total += nAwal;
            System.out.println("ditambah " + nAwal + " menjadi " + total);
        }

        System.out.println("\n------------------DO WHILE");
        System.out.print("Masukkan Nilai Pertama : ");
        nAwal = scanner.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        nAkhir = scanner.nextInt();
        total = 0;

        do {
            total = total + nAwal;
            System.out.println("ditambah " + nAwal + " menjadi " + total);
            nAwal++;
        }while (nAwal <= nAkhir);

    }
}
