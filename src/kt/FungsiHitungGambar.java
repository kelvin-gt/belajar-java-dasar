package kt;

import java.util.Scanner;

public class FungsiHitungGambar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        var p = scanner.nextInt();
        System.out.print("Masukkan Lebar : ");
        var l = scanner.nextInt();

        System.out.println("Panjang = " + p);
        System.out.println("Lebar = " + l);
        gambar(5, 8);

        System.out.println("Luas = " + luas(p,l));
        System.out.println("Keliling = " + keliling(p,l));
    }

    public static void gambar(int panjang, int lebar) {
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int luas (int panjang, int lebar) {
        return (panjang * lebar);
    }

    public static int keliling (int panjang, int lebar) {
        return ((panjang + lebar) * 2);
    }
}
