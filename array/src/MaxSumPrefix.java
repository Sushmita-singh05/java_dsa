import java.util.Scanner;
public class MaxSumPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int start=0; start<n; start++){
            for(int end=start; end<n; end++){
                int currSum;
                if(start == 0)
                    currSum = prefix[end];
                else
                    currSum = prefix[end] - prefix[start-1];
                if(currSum > maxSum)
                    maxSum = currSum;
            }
        }
        System.out.println("Maximum Subarray Sum: "+maxSum);
    }
}
