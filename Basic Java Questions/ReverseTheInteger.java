import java.util.Scanner;

public class ReverseTheInteger {

    public void reverseInteger(int input) {
        int ans=0;
        while(input != 0) {
            int digit = input%10;
            ans = ans*10+digit;
            input = input/10;
        }
        System.out.println("Reverse of Integer : " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        ReverseTheInteger rs = new ReverseTheInteger();

        rs.reverseInteger(input);
    }
}
