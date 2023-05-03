import java.util.Scanner;
import java.util.Arrays;
public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int count=arr.length;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element for array: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The sorted array is: ");
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
