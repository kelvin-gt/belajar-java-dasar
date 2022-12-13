package pzn;

public class MethodVarArgument {
    public static void main(String[] args) {

        int[] nilai = {70,90,90,75,75};
        sayCongrats("Hazard", nilai);

        sayCongrats2("Messi", 50,80,50,90,85);
    }

    static void sayCongrats(String name, int[] values) {

        var total = 0;
        for (var value: values) {
            total+= value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", anda lulus.");
        } else {
            System.out.println("Maaf " + name + ", anda belum lulus.");
        }
    }

    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value: values) {
            total+= value;
        }
        var finalValue = total / values.length;

        String text = finalValue >= 75 ? "Selamat " + name + ", anda lulus." : "Maaf " + name + ", anda belum lulus.";
        System.out.println(text);
    }
}
