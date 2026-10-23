import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];
        int sum, total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            sum = 0;

            for (int j = 0; j < 2; j++) {
                sum += arr[i][j];
            }

            System.out.print(sum / 2 + " ");
        }

        System.out.println();

        for (int j = 0; j < 2; j++) {
            sum = 0;

            for (int i = 0; i < 4; i++) {
                sum += arr[i][j];
            }

            System.out.print(sum / 4 + " ");
        }

        System.out.println();
        System.out.print(total / 8);
    }
}
