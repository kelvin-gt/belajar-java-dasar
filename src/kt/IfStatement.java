package kt;

public class IfStatement {
    public static void main(String[] args) {

        int a = 7;
        int b = 7;

        if (a == 10) {
            if (b == 5) {
                System.out.println("nilai a == 10, b == 5");
            } else {
                System.out.println("nilai a == 10, b != 5 ");
            }
        }else {
            System.out.println("nilai a != 10, b != 5");
        }
    }
}
