import java.util.Scanner;

/** Bonusaufgaben aus Basic-Modul
 *
 * @author Michael Reinisch
 */
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        char letter;

        System.out.println("Geben Sie Ihren Namen ein: ");
        name = scanner.nextLine();
        System.out.println("Geben Sie Ihr Alter ein: ");
        age= Integer.parseInt(scanner.nextLine());
        System.out.println("Geben Sie Ihren Lieblingsbuchstaben ein: ");
        letter= scanner.nextLine().charAt(0);
        System.out.println(String.format("Hallo %s, dein Lieblingsbuchstabe ist %c und du bist %d Jahre alt.", name,letter, age));
        scanner.close();
    }
}
