import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num, sum = 0;
        double avg;

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            sum += num;
        }

        avg = (double) sum / n;

        System.out.printf("%.2f", avg);
    }
}
