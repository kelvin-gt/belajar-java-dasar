package kt;

public class Fungsi_Method {
    public static void main(String[] args) {

        int x,y;

        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }

    public static int hitung(int value) {
        int hasil = value * value;
        return hasil;
    }
}
