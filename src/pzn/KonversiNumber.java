package pzn;

public class KonversiNumber {
    public static void main(String[] args) {


        // Widening Casting (Otomatis) dari kecil ke besar
        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual) dari besar ke kecil
        int iniInt2 = 100000;
        byte iniByte2 = (byte) iniInt2;
        System.out.println(iniByte2); // Kena number over flow
    }
}
