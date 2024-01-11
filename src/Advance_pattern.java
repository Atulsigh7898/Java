//import java.util.*;
public class Advance_pattern {
    public static void main(String args[]){

//        Scanner sc = new Scanner(System.in);
        int n = 5;


        // upper Half
//        for(int i = 1; i <=n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//
//            //Space
//            int spaces = 2*(n-i);
//
//            for(int j = 1; j<= spaces; j++){
//                System.out.print(" ");
//            }
//            // 2nd Half
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // lower half
//
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            //Space
//            int spaces = 2*(n-i);
//            for(int j = 1; j<= spaces; j++){
//                System.out.print(" ");
//            }
//            // 2nd Half
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Rombuss problem
//        for (int i = 1 ; i <= n; i++){
//            for (int j = 1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int  j=1 ; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1 ; i <= n; i++){
//            for (int j = 1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j<= i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //palindromic pattern

//        for (int i = 1; i<=n; i++){
//
//            for(int j =1; j<=n-i;j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j>=1; j--){
//                System.out.print(j);
//            }
//
//            //2nd half
//            for (int j =2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n; i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
