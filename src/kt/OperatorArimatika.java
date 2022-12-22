package kt;

public class OperatorArimatika {
    public static void main(String[] args) {

        // Operasi Aritmatika
        int variabel1 = 11;
        int variabel2 = 5;

        int hasil;

        // 1. Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(hasil);
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        // 2. Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2, hasil);

        // 3. Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1, variabel2, hasil);

        // 4. Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2, hasil);

        float a = 5;
        float b = 3;
        float hasil2 = a / b;
        System.out.println(a + " / " + b + " = " + hasil2);

        // 5. Modulus (Sisa hasil bagi)
        hasil = variabel1 % variabel2;
        System.out.println(variabel1 + " % " + variabel2 + " = " + hasil);
        System.out.printf("%d %% %d = %d",variabel1, variabel2, hasil);
    }
}
