import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mh = sc.nextInt();
        int mw = sc.nextInt();
        int gh = sc.nextInt();
        int gw = sc.nextInt();
        
        System.out.print(mh > gh && mw > gw);
    }
}
