import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int wid = sc.nextInt();
        int len = sc.nextInt();
        
        wid += 5;
        len *= 2;

        System.out.printf("width = %d\n", wid);
        System.out.printf("length = %d\n", len);
        System.out.printf("area = %d", wid * len);
    }
}
