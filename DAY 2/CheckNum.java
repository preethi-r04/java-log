
import java.util.Scanner;
public class CheckNum {
    public  int checknum(int num){
        if(num>0){
            return 1;
        }
        else if(num==0){
            return 0;
        }
        else{
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        CheckNum obj = new CheckNum();
        int res = obj.checknum(num);

        if(res == 1){
        System.out.println("The Number is Postive!! ");
        }
        else if(res==-1){
            System.out.println("The Number is Negative!!");
        }
        else{
            System.out.println("The Number is Zero");
        }

        sc.close();
    }

}
