import java.util.*;

public class pattern {
    public static void main(String args[]){
//        Scanner sc = new Scanner();

        //1

//        int n = 4;
        int m = 5;
//        for(int i = 1; i <= n; i++){
//            for (int j = 1; j <= m; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //2

//        for(int i = 1; i <=n; i ++){
//            for(int j=1; j<= m; j++){
//                if (i == 1 || j == 1 || i==n || j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //3

//        for(int i = n; i >=1; i--){
//            for(int j=1; j<= i; j++){
//                System.out.print("  *");
//            }
//            System.out.println();
//        }

        //4

//        for(int i = 1; i <=n; i++){
//            for(int j=1; j<= i; j++){
//                System.out.print("  *");
//            }
//            System.out.println();
//        }

        //5
//
//        for(int i = 1; i<=n ; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //6

//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //7

        int n = 5;

//        for (int i = 1; i<=n; i++){
//            for(int j = 1; j <= n-i+1 ; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //8

        int number = 1;
//        for(int i = 1; i<= n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(number+" ");
//                number++; //number = number +1;
//            }
//            System.out.println();
//        }

        //9

        for (int i = 1; i<=n ; i++){
            for (int j=1; j <=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i<= n; i++){
            for (int j=1; j <=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }





    }
}
