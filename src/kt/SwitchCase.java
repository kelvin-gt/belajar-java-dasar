package kt;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // ekspresinya berupa satuan
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input nama mu : ");
        var input = scanner.next();

        switch (input.toLowerCase()) {
            case "kelvin":
                System.out.println("Saya Kelvin hadir");
                break;
            case "gilbert":
                System.out.println("Saya Gilbert hadir");
                break;
            case "tanoko":
                System.out.println("Saya Tanoko hadir");
                break;
            default:
                System.out.println("tidak diketahui siapa anda");
                break;
        }

        String output = switch (input.toLowerCase()) {
            case "kelvin":
                yield "Saya Kelvin hadir";
            case "gilbert":
                yield "Saya Gilbert hadir";
            case "tanoko":
                yield "Saya Tanoko hadir";
            default:
                yield "Tidak diketahui siapa anda";
        };
        System.out.println(output);

        switch (input.toLowerCase()) {
            case "kelvin" -> System.out.println("Saya Kelvin hadir");
            case "gilbert" -> System.out.println("Saya Gilbert hadir");
            case "tanoko" -> System.out.println("Saya Tanoko hadir");
            default -> System.out.println("Tidak diketahui siapa anda");
        }
    }
}
