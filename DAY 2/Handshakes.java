
import java.util.Scanner;
public class Handshakes {
    public int calculateHandShakes(int n){
        int hs = (n*(n-1))/2;
        return hs;
    }
    public static void main(String[] args) {
        System.out.println("Enter the no. of Students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Handshakes obj = new Handshakes();
        int hs1 = obj.calculateHandShakes(n);

        System.out.println("The Maximum no. of HandShakes: "+ hs1);
        sc.close();

    }
    
}
