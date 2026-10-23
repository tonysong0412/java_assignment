import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0, sum = 0, num = 0;
        double avg;

        while (true) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }

            arr[cnt] = a;
            cnt += 1;
        }

        cnt = 0;

        for (int i = 0; i < 100; i++) {
            if (arr[i] != 0 && arr[i] % 5 == 0) {
                cnt += 1;
                sum += arr[i];
            }
        }

        if (cnt == 0) {
            avg = 0;
        } else {
            avg = (double) sum / cnt;
        }

        System.out.printf("Multiples of 5 : %d\n", cnt);
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f\n", avg);
    }
}
