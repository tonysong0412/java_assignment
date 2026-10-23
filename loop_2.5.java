import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, odd = 0, even = 0;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.printf("even : %d\n", even);
        System.out.printf("odd : %d\n", odd);
    }
}
