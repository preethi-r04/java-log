import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip the coin: ");
        int n = sc.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= n; i++) {
            double randomValue = Math.random();

            if (randomValue < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        double headPercentage = (heads * 100.0) / n;
        double tailPercentage = (tails * 100.0) / n;

        System.out.println("Heads Percentage: " + headPercentage + "%");
        System.out.println("Tails Percentage: " + tailPercentage + "%");
    sc.close();
    }

}

