import java.util.Scanner;
import java.lang.Math;
public class PowerOf2 {

    public static void getPower(int input) {
        for(int i=0;i<=30;i++) {
            int ans = (int) Math.pow(2, i);
            if(ans == input) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void getPower1(int input) {
        int ans=1;
        for(int i=0;i<=30;i++) {
            if(ans == input) {
                System.out.println("Yes");
                return;
            }
            if(ans < Integer.MAX_VALUE/2) {
                ans = ans*2;
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        getPower(input);
    }
}
