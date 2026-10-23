import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, cnt = 0;

        while (cnt < 20) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            cnt += 1;
        }

        System.out.printf("%d %d", sum, sum / cnt);
    }
}
