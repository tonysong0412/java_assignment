import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i < 100; i += num) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                break;
            }
        }
    }
}
