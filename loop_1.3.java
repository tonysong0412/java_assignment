import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;
        double avg;

        while (true) {
            int n = sc.nextInt();

            if ((n > 100) || (n < 0)) {
                break;
            }

            sum += n;
            cnt += 1;
        }
        avg = (double) sum / cnt;


        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg);

    }
}
