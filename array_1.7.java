import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;
        int max = -1000, min = 1000;

        while (true) {
            int num = sc.nextInt();

            if (num == 999) {
                break;
            }

            arr[cnt] = num;
            cnt += 1;
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.printf("max : %d\n", max);
        System.out.printf("min : %d\n", min);
    }
}
