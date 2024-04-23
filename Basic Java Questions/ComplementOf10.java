import java.util.Scanner;


/*
Solution : 
input = 5 -> 0000000101
mask = 5 -> 000000000101 = right shift until 0, main count of total right shifts
mask => 0000000000
left shift with |1
mask = 000000000111

now ~input = 111111111010
mask = 0000000000111

Through ~ we getting our answer but we have to igone the left most part of input i.e 1111111..

for that ~input & mask;


*/

public class ComplementOf10 {

    public static void complementofNumber(int input) {
        int mask = 0;
        int n=input;
        while(n !=0) {
            mask = (mask << 1) | 1;
            n = n >>1;
        }
        int ans = ~(input) & mask;
        System.out.println("Complement of base 10: " + ans);
    }
    public static void main(String[] args) {
        // Complement of base 10 Integer
        // i.e 5 => 101,  Complement of 101 => 010
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        complementofNumber(input);
    }
}
