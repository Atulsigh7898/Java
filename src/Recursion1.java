import java.util.*;

public class Recursion1 {
    // 5 to 1
//    public static void printNumb(int n){
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }
//    public static void main(String args[]){
//        int n = 5;
//        printNumb(n); //n = 5
//
//    }

    // 1 to 5
//    public static void printNumb(int n){
//        if (n == 6){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }
//    public static void main(String args[]){
//        int n = 1;
//        printNumb(n); //n = 5
//
//    }

    //sum of frist natural number

//    public static void printSum(int i, int n, int sum){
//        if(i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
//        System.out.println(i);
//    }
//    public static void main(String args[]){
//        printSum(1, 5 , 0); //n = 5
//

    //print the factorial n;

//public static int calcfactorial(int n){
//    if( n == 1 || n == 0){
//        return 1;
//    }
//    int fact_nm1 = calcfactorial(n-1);
//    int fact_n = n*fact_nm1;
//    return  fact_n;
//}
//    public static void main(String args[]){
//       int n = 5;
//       int ans = calcfactorial(n);
//        System.out.println(ans);
//    }

    //print the number fibonaci series till nth term

//    public static void printFib( int a, int b, int n){
//        if(n == 0){
//            return;
//        }
//        int c = a+b;
//        System.out.println(c);
//        printFib(b, c ,n-1);
//    }
//    public static void main(String args[]){
//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib(a, b, n-2);
//
//    }

    //print the x^n(stack height = n);

//    public static int calcPower( int x,int n){
//        if( n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//        int xPownm1 = calcPower(x,n-1);
//        int xPown = x * xPownm1;
//        return xPown;
//    }
//    public static void main(String args[]){
//        int x = 2, n = 5;
//        int ans = calcPower(x, n);
//        System.out.println(ans);
//
//
//    }

    //print the x ^n (stack height = logn)

    public static int calcPower( int x,int n){
        if( n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        // if n even
        if(n % 2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{
            return calcPower(x, n/2) * calcPower(x,n/2) * x;
        }

    }
    public static void main(String args[]){
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);


    }
}
