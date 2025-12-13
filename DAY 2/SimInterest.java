import java.util.Scanner;
public class SimInterest {
    public static double CalSI(double principal,double rate,double time){
        double SI = (principal*rate*time)/100;
        return SI;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        double principal=sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        double Si = CalSI(principal,rate,time);

        System.out.println("Simple Interest: "+Si);

        sc.close();
    }
    
}
