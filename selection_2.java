import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if (a == 0) {
            System.out.print("zero");
        } else if (a > 0) {
            System.out.print("plus");
        } else {
            System.out.print("minus");
        }
    }
}
