package pzn;

public class SwitchStatement {
    public static void main(String[] args) {

        // Switch Case
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow nilai anda sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Nilai anda kurang untuk lulus");
                break;
            default:
                System.out.println("Anda mungkin salah jurusan");
                break;
        }

        switch (10/2) {
            case 4:
                System.out.println("Nilai 4");
                break;
            case 5:
                System.out.println("Nilai 5");
                break;
            default:
                System.out.println("Zonk");
                break;
        }

        // Switch Case Lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow nilai anda sangat bagus");
            case "B", "C" -> System.out.println("Nilai anda cukup");
            case "D" -> System.out.println("Nilai anda kurang untuk lulus");
            default -> System.out.println("Anda mungkin salah jurusan");
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow nilai anda sangat bagus";
            case "B", "C" -> ucapan = "Nilai anda cukup";
            case "D" -> ucapan = "Nilai anda kurang untuk lulus";
            default -> ucapan = "Anda mungkin salah jurusan";
        }
        System.out.println(ucapan);

        // Switch Case Yield

        ucapan = switch (nilai) {
            case "A":
                yield "Wow nilai anda sangat bagus";
            case "B", "C":
                yield "Nilai anda cukup";
            case "D":
                yield "Nilai anda kurang untuk lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
