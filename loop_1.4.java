import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, cnt = 0;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if ((num % 3 == 0) || (num % 5 == 0)) {
                continue;
            } else {
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}
