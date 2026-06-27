import java.util.Scanner;
public class MaxSumBruteForce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        for(int start=0; start<n; start++){
            for(int end=start; end<n; end++){
                int currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: "+maxSum);
    }
}
