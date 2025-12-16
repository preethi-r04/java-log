import java.util.Scanner;
public class SumofN {
    public int sumN(int n){
        int sum=0;
        for(int i = 0;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n = sc.nextInt();

        SumofN obj = new SumofN();
        int res = obj.sumN(n);
        System.out.println("Sum of N: "+res);
   sc.close();
    }
}
