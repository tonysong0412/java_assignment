import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double yd = 91.44;

        System.out.print("yard? ");
        double len = sc.nextDouble();
        
        System.out.printf("%.1fyard = %.1fcm", len, len * yd);
    }
}