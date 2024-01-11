import java.util.*;

public class Condition {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        if (age > 18){
//            System.out.println("you are adult");
//        }else{
//            System.out.println("Not adult");
//        }

//        if(x % 2 == 0){
//            System.out.println("The number is even");
//        }else{
//            System.out.println("The number is odd");
//        }

        if(a == b){
            System.out.println("equal");
        }
        else if (b < a) {
                System.out.println("the a is greater");
            }
        else {
                System.out.println("The b is Greater");
            }

        }
    }

