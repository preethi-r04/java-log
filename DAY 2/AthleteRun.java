import java.util.Scanner;
public class AthleteRun {
    public double perimeter(double s1, double s2, double s3){
        double perimeter = s1+s2+s3;
        return perimeter;
    }
    public double NumRounds(double s1, double s2, double s3){
        double rounds = 5000/perimeter(s1,s2,s3);
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side 1: ");
        double s1=sc.nextDouble();

        System.out.println("Side 2: ");
        double s2=sc.nextDouble();

        System.out.println("Side 3: ");
        double s3=sc.nextDouble();

        AthleteRun obj = new AthleteRun();
        double cal = obj.NumRounds(s1, s2, s3);
        System.out.println("Number of Rounds: "+ cal);

        sc.close();

    }
    

    
}
