package kt;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Perulangan ke " + i);
        }
        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.println("Perulangan ke " + i);
        }
        System.out.println();

        int i = 0;
        for (;i <= 10;) {
            System.out.println("Perulangan ke " + i);
            i++;
        }
        System.out.println();
    }
}
