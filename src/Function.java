import java.util.*;
public class Function {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name);
//    }


//    //Second qustion
//    public static int calculateSum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println("Sum of two numbers = "+sum);
//    }


//    public static int calculateProduct(int a, int b){
//        return a * b;
//
//    }


//    //Second qustion
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateProduct(a, b);
//        System.out.println("Product of two numbers is= "+calculateProduct(a, b));
//    }

//    public static int calculateProduct(int a, int b){
//        return a * b;
//
//    }

    public static void printFactorial(int n){
        int factorial = 1;

        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    //Second qustion
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
