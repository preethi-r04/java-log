import java.util.Scanner;


public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");

        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int Quotient = num1/num2;
        int Remainder = num1%num2;

        System.out.println("Quotient: "+ Quotient);
        System.out.println("Remainder: "+ Remainder);
    sc.close();
    }
}
