import java.util.Scanner;
public class decimalToBinary {
    public static int decToBin(int decNum) {
        int binNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int binary = decToBin(num);
        System.out.println("Binary number = " + binary);
    }
}