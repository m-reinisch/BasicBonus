import java.util.Scanner;

/** Bonusaufgaben aus Basic-Modul
 *
 * @author Michael Reinisch
 */
public class Main {
    static void main() {
        /***** Data Types Exercise 3.1 *****/
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        int age;
//        char letter;
//
//        System.out.println("Geben Sie Ihren Namen ein: ");
//        name = scanner.nextLine();
//        System.out.println("Geben Sie Ihr Alter ein: ");
//        age= Integer.parseInt(scanner.nextLine());
//        System.out.println("Geben Sie Ihren Lieblingsbuchstaben ein: ");
//        letter= scanner.nextLine().charAt(0);
//        System.out.println(String.format("Hallo %s, dein Lieblingsbuchstabe ist %c und du bist %d Jahre alt.", name,letter, age));
//        scanner.close();
        /***** Data Types Exercise 3.4 *****/
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double c;

        System.out.println("Gib eine Ganzzahl ungleich 0 ein:");
        a= Integer.parseInt(scanner.nextLine());
        System.out.println("Gib eine Ganzzahl ein:");
        b= Integer.parseInt(scanner.nextLine());
        System.out.println("Gib eine Kommazahl ein:");
        c= Double.parseDouble(scanner.nextLine());
        scanner.close();
        System.out.println(String.format("%d geteilt durch %d mal %.2f ergibt %.2f.", b, a, c, calculate(a, b, c)));
    }

    public static double calculate(int x, int y, double z){
        double result= 0.0;
        double division;
        double multiplication;

        division= (double)y / x;
        multiplication= division * z;
        result= Math.round(multiplication * 100.0) / 100.0;
        return result;
    }
}
