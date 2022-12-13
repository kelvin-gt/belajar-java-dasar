package pzn;

public class MethodRecursive {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));

        System.out.println(factorialRecursive(5));

        loop(10_000);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return  result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Program Selesai");
        } else {
            System.out.println("Perulangan ke " + value);
            loop(value - 1);
        }
    }
}
