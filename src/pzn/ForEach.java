package pzn;

public class ForEach {
    public static void main(String[] args) {

        System.out.println("---------For ---------");

        String[] names = {
                "Kelvin", "Gilbert", "Tanoko", "Samuel"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("\n---------For Each---------");

        for (String name: names) {
            System.out.println(name);
        }
    }
}
