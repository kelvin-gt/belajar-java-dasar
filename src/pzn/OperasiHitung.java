package pzn;

public class OperasiHitung {
    public static void main(String[] args) {

        // Operasi Hitung
        int a = 10;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Operasi Augmented Assignments
        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c %= 9;
        System.out.println(c);

        // Operasi Unary
        int angka1 = +100;
        int angka2 = -100;

        angka1++;
        System.out.println(angka1);

        System.out.println(!true);
    }
}
