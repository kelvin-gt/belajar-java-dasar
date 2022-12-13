package pzn;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Byte iniByte = null;
        Integer iniInteger = 1000;

        // Konversi dari primitif ke tipe data non-primitif / object
        int age = 30;

        Integer ageObject = age;

        // Konversi dari non-primitif / object ke tipe data primitif
        int ageAgain = ageObject;

        Long iniLong = ageObject.longValue();

        Double iniDouble = Double.valueOf(age);
    }
}
