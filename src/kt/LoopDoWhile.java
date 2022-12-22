package kt;

public class LoopDoWhile {
    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        do {
            System.out.println(a);
            if (a == 10) {
                kondisi = false;
            }
            a++;
        } while (kondisi);
    }
}
