package kt;

import java.util.Scanner;

public class LatihanKalkulatorSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a, b, hasil;
        String operator;

        System.out.print("Input Value Pertama : ");
        a = scanner.nextFloat();
        System.out.print("Input operator : ");
        operator = scanner.next();
        System.out.print("Input Value Kedua : ");
        b = scanner.nextFloat();

        switch (operator) {
            case "+":
                hasil = a + b;
                System.out.println(hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println(hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println(hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println(hasil);
                break;
            default:
                System.out.println("Operator tidak diketahui");
                break;
        }
    }
}
