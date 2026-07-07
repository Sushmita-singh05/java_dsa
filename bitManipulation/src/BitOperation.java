import java.util.Scanner;
public class BitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();
        // 1. Get i-th Bit
        if ((num & (1 << i)) != 0)
            System.out.println("Get Bit: 1");
        else
            System.out.println("Get Bit: 0");
        // 2. Set i-th Bit
        int setBit = num | (1 << i);
        System.out.println("After Set Bit: " + setBit);
        // 3. Clear i-th Bit
        int clearBit = num & ~(1 << i);
        System.out.println("After Clear Bit: " + clearBit);
        // 4. Update i-th Bit
        System.out.print("Enter new bit (0 or 1): ");
        int newBit = sc.nextInt();
        int updateBit = (num & ~(1 << i)) | (newBit << i);
        System.out.println("After Update Bit: " + updateBit);
        // 5. Clear Last i Bits
        int clearLastBits = num & (~0 << i);
        System.out.println("After Clearing Last " + i + " Bits: " + clearLastBits);
        sc.close();
    }
}
