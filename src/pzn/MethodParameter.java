package pzn;

public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Kelvin", "Gilbert");
        sayHello("Eko", "Kurniawan");
        sayHello("Naruto", "Uzumaki");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
