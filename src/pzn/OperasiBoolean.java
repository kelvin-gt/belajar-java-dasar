package pzn;

public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        System.out.println(lulusAbsen);

        boolean lulusNilaiAkhir = nilaiAkhir >= 75;
        System.out.println(lulusNilaiAkhir);

        boolean lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
