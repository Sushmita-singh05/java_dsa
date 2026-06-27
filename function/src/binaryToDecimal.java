import java.util.Scanner;
public class binaryToDecimal {
    public static int binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        int decimal = binToDec(num);
        System.out.println("Decimal number = " + decimal);
    }
}