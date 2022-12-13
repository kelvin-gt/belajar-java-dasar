package pzn;

public class WhileLoop {
    public static void main(String[] args) {

        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        System.out.println();
        counter = 100;
        do {
            System.out.println("Perulangan ke-" + counter);
        }while (counter <= 10);
    }
}
