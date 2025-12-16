import java.util.Scanner;

public class PowerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base value: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("Result: " + result);
    }
}
