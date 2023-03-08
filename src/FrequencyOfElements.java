import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<5;i++){
            System.out.println("Enter element for array: ");
            arr[i]=sc.nextInt();
        }
        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + " occurs " + freq[i] + " times.");
            }
        }
    }
}
