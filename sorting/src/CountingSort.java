import java.util.Scanner;
public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }
        int[] count = new int[max + 1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i=0; i<=max; i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
