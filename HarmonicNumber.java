import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Harmonic number is not defined for 0.");
        } else {

            double harmonic = 0.0;

            for (int i = 1; i <= n; i++) {
                harmonic = harmonic + (1.0 / i);
            }

            System.out.println("The " + n + "th Harmonic Value is: " + harmonic);
        }
        scanner.close();
    }
}
