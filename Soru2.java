import java.util.Locale;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Enter n: ");
        int maxUS = scanner.nextInt();
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double result = 1;
        double valueOfXMultiplied = 1;

        for (int i = 0; i < maxUS; i++) {
            for (int j = 0; j <= i; j++) {
                valueOfXMultiplied *= x / (j + 1);
            }
            result += valueOfXMultiplied;
            valueOfXMultiplied = 1;
        }

        System.out.println("The answer: " + result);
    }
}
