import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        int num;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            arr[num / 10] += 1;
        }

        for (int i = 10; i >= 0; i--) {
            if (arr[i] != 0) {
                System.out.printf("%d : %d person\n", i * 10, arr[i]);
            }
        }
    }
}
