import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        // Sign bit : The first bit of binary number
        //Negative Number : by doing & 1 to number if it is 1 then number is negative
        //Positive Number : by doing & 1 to number if it is 0 then number is positive

        // To calculate the left shift and right shift manually 

        //For left Shift we multiply with 2
        // 10 << 2 = 10*2 = 20, 20*2 = 40 is the ans
        // 21 << 2 = 21*2 = 42, 42*2 = 84 is the ans

        // For right shift we divide with 2
        // 17 >> 2 = 17/2 = 8, 8/2 = 4;

        //To get the leftmost bit of an number use & operator.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int number = sc.nextInt();
        int ans=0;
        int i=0;
        while(number!=0) {

            // Always remember when converting decimal to binary, we have to convert decimal number to binary, so to get the binary digit of decimal number we can get using & 1.
            int bit = number & 1;
            ans = ((int) Math.pow(10, i) * bit) + ans;
            i++;
            number = number/2;// or n = n>>1;
        }
        System.out.println(ans);
        sc.close();



    }
}
