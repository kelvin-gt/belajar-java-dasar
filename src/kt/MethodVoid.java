package kt;

public class MethodVoid {
    public static void main(String[] args) {

        input("apa ajalah.........");
        selamatPagi("Kelvin");
        System.out.println(angkaFloat());
    }

    public static void input(String input) {
        System.out.println(input);
    }

    public static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama);
    }

    public static float angkaFloat() {
        return 10.5F;
    }
}
