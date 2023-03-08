import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element for array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array in reverse order is: ");
        for (int i = 5 - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
