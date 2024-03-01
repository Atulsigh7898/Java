public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        int numberOfBits = 32; // Assuming 32-bit integer
        int maxOddBinary = (1 << (numberOfBits - 1)) - 1; // Set all bits to 1 except the LSB
        System.out.println("Maximum odd binary number: " + Integer.toBinaryString(maxOddBinary));
    }
}
