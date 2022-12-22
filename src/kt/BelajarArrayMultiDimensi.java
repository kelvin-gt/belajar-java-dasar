package kt;
import java.util.Arrays;

public class BelajarArrayMultiDimensi {
    public static void main(String[] args) {

        System.out.println("Belajar Array Multi Dimensi");

        int[][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);

        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

    }

    private static void printArray2D(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
