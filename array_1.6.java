import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
        char ch = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < 6; i++) {
            if (arr[i] == ch) {
                System.out.print(i);
                cnt += 1;
                break;
            }
        }

        if (cnt == 0) {
            System.out.print("none");
        }
    }
}
