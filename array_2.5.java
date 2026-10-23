import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][3];
        int sum;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass? ", i + 1);

            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }

            System.out.printf("%dclass : %d\n", i + 1, sum);
        }
    }
}
