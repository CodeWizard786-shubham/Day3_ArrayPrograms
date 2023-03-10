import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element for array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(i+" "+arr[i]);
        }
    }
}
