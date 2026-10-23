import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            arr[cnt] = num;
            cnt += 1;
        }

        if (cnt < 3) {
            for (int i = 0; i < cnt; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = cnt - 3; i < cnt; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
