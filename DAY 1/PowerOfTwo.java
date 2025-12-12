import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n >= 0 && n < 31) {

            for (int i = 0; i <= n; i++) {
                int result = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + result);
            }

        } else {
            System.out.println("Please enter a value between 0 and 30.");
        }
        scanner.close();
    }
}
