
import java.util.Scanner;
public class ArrayPrograms {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<5;i++){
            System.out.println("Enter element for array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array are: ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
