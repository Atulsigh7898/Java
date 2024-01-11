import java.util.*;

public class BitManipulation {
//    public static void main(String args[]){
//        int  n = 5; //0101
//        int pos = 3;
//        int bitMask = 1<<pos;
//        if((bitMask & n) == 0){
//            System.out.println("Bit was zero");
//        }else{
//            System.out.println("Bit was one");
//        }
//    }

//    public static void main(String args[]) {
//        int n = 5; //0101
//        int pos = 1;
//        int bitMask = 1 << pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);
//
//    }
    //not with and
//public static void main(String args[]) {
//    int n = 5; //0101
//    int pos = 2;
//    int BitMask = 1 << pos;
//    int notBitMask = ~(BitMask);
//
//    int newNumber = notBitMask & n;
//    System.out.println(newNumber);
//
//}

    //update
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 set oper = 0; clear

        int n = 5; //0101 - 0111 -> dec
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper == 1){
            //set

            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
       else{
           int newBitmask = ~(bitMask);
           int newNumber = newBitmask & n;
            System.out.println(newNumber);

       }


    }
}
