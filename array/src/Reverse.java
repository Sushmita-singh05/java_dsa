import java.util.Scanner;
//public class Reverse {
//    public static void reverseArray(int[] arr){
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements of array: ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Reversed Array: ");
//        reverseArray(arr);
//    }
//}
public class Reverse{
    public static void reverseArray(int[] arr){
        int first = 0, last = arr.length - 1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array: ");
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
