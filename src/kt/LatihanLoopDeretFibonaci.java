package kt;

public class LatihanLoopDeretFibonaci {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int f_n, f_n_2, f_n_1, n;

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        System.out.println("Program Fibonacci");
        System.out.print("Mengambil nilai Fibonacci ke : ");
        n = scanner.nextInt();

        System.out.println("--------------------------FOR");
        for (int i = 1; i <= n; i++) {
            System.out.println("Deret ke " + i + " fibonacci berjumlah : " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

        System.out.println("--------------------------WHILE");
        int i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        while(i <= n) {
            System.out.println("Deret ke " + i + " fibonacci berjumlah : " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }

        System.out.println("--------------------------DO WHILE");
        i = 1;
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        do {
            System.out.println("Deret ke " + i + " fibonacci berjumlah : " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            i++;
        }while(i <= n);
    }
}