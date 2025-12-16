import java.util.Scanner;
public class SpringSeason {
    public int Season(int month,int day){
        if ((month==3 && day>=20 )|| month == 4|| month == 5|| (month ==6 && day <=20)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        SpringSeason obj = new SpringSeason();
        int res = obj.Season(month, day);
        if(res==1){
            System.out.println("It is Spring Season!!");
        }
        else{
            System.out.println("It is not");
        }
        sc.close();
    }
}
