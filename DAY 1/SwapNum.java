import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num 1: ");
        int a = sc.nextInt();
        System.out.print("Num 2: ");
        int b = sc.nextInt();

        System.out.println("Number Before Swap: "+ "a: "+ a +" " + "b: " + b);

        int temp;
        temp = a;
        a=b;
        b=temp;

        System.out.println("Number After Swap: "+ "a: "+ a + " "+"b: "+b);

        sc.close();
    }
}
