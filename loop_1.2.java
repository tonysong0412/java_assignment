import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd, even, num;
        
        odd = 0;
        even = 0;
        
        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.printf("odd : %d\n", odd);
        System.out.printf("even : %d\n", even);
    }
}
