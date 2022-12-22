package kt;

public class LoopWhile {
    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("Perulangan ke " + a);
            if (a == 10) {
                kondisi = false;
            }
            a++;
        }
    }
}
