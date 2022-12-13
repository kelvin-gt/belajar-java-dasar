package pzn;

public class MethodReturnValue {
    public static void main(String[] args) {

        System.out.println(sum(100,50));
        System.out.println(hitung2(100, "+", 20));
        System.out.println(hitung2(100, "-", 30));
    }

    static int sum (int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung2 (int value1, String operasi, int value2) {
        switch (operasi) {
            case "+": return value1 + value2;
            case "-": return value1 - value2;
            default: return 0;
        }
    }
}
