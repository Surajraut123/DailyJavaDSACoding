import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseTheArray {

    // Method to reverse an array of integers
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to read integers into an array using Scanner
    public static int[] readArray(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.err.println("Invalid array size. Size must be a positive integer.");
            System.exit(1);
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Method to reverse array using ArrayList
    public static void reverseArrayList(Scanner scanner) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter integers to be stored in ArrayList (-1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            arrayList.add(num);
        }
        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);
        reverseArray(array);
        System.out.println("Reversed Array: " + java.util.Arrays.toString(array));
        reverseArrayList(scanner);
        scanner.close();
    }
}
