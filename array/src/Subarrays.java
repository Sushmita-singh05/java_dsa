import java.util.Scanner;
public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All subarrays: ");
        for(int start=0; start<n; start++){
            for(int end=start; end<n; end++){
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}