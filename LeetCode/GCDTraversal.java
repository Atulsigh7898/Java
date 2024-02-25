import java.util.ArrayList;

public class GCDTraversal {
    
    // Function to find the Greatest Common Divisor (GCD) using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Function to traverse the Greatest Common Divisor (GCD)
    public static ArrayList<Integer> gcdTraversal(int gcd) {
        ArrayList<Integer> traversal = new ArrayList<>();
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                traversal.add(i);
            }
        }
        return traversal;
    }
    
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        
        // Find GCD using Euclidean Algorithm
        int gcd = gcd(num1, num2);
        
        // Traverse GCD
        ArrayList<Integer> gcdTraversal = gcdTraversal(gcd);
        
        // Print GCD and its traversal
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("Traversal of GCD " + gcd + ": " + gcdTraversal);
    }
}
