package kt;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int inputUser = scanner.nextInt();

        // variable x = ekspresi ? statement true : statement false
        int x = (inputUser == 10) ? (inputUser * 5) : (inputUser + 2);
        System.out.println(x);

    }
}
