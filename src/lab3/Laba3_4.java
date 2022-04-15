package lab3;
import java.util.*;
public class Laba3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String phone = scanner.nextLine();

        System.out.println("*".repeat(name.length() + 4));
        System.out.println("* " + name + " *");
        System.out.println("*".repeat(name.length() + 4));

        System.out.println();

        System.out.println("*".repeat(phone.length() + 4));
        System.out.println("* " + phone + " *");
        System.out.println("*".repeat(phone.length() + 4));
    }
}
