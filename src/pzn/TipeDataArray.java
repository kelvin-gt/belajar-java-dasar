package pzn;

public class TipeDataArray {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Kelvin";
        names[1] = "Gilbert";
        names[2] = "Tanoko";

        // Array Initializer
        int[] ages = new int[] {
                12, 20, 30, 40, 50
        };

        int[] ages2 = {12, 20, 30, 40, 50};

        System.out.println(ages2[0]);

        ages2[0] = 11;

        System.out.println(ages2[0]);
        System.out.println(ages2.length);

        // Array di dalam Array
        String[][] members = {
                {"Ade","Setiawan"},
                {"Al","Seti"},
                {"EL","Setyo"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[2][1]);

    }
}
