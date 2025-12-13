import java.util.Scanner;

public class VowelCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);

        val = Character.toLowerCase(val);


        if (val == 'a' || val == 'e' || val == 'i' || val == 'o'|| val == 'u'){
            System.out.println("Vowel!!");

        } 
        else{
            System.out.println("Consonant");
        }
        sc.close();
    }
    
}
