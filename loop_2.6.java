import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0, cnt = 0;
        double avg;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
                cnt += 1;
            }
        }

        avg = (double) sum / cnt;

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f\n", avg);
    }
}
