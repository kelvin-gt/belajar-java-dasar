package kt;

public class OperatorPerbandingan {
    public static void main(String[] args) {

        // ini akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;

        // Persamaaan
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b, hasilKomparasi);

        // Pertidaksamaan
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b, hasilKomparasi);

        // Kurang Dari / Less Than
        a = 8;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b, hasilKomparasi);

        // Lebih Dari / Greater Than
        a = 8;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b, hasilKomparasi);

        // Kurang Dari Sama Dengan / Less Than Equal
        a = 8;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n",a,b, hasilKomparasi);

        // Lebih Dari Sama Dengan / Greater Than Equal
        a = 8;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n",a,b, hasilKomparasi);
    }
}
