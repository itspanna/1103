
import java.util.Scanner;

public class rombusz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Rombusz terulete:");
        System.out.println("Panna Teleki, 2/1/N ");

        System.out.println("Add meg az (e) hossz-t: ");
        double e = scanner.nextDouble();

        System.out.println("Add meg az (f) hossz-t: ");
        double f = scanner.nextDouble();

        double terulet = (e * f) / 2;
        System.out.println("A rombusz terulete: " + terulet);

        scanner.close();
    }
}
