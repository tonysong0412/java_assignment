import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (a <= b) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);

                    if (j != b) {
                        System.out.print("   ");
                    }
                }
            } else {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);

                    if (j != b) {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
