//import java.util.*;
//public class StringBuilder {
//    public static void main(String args[]){
//
//         StringBuilder sb = new StringBuilder("A");
//         sb.append("tu"); //str = str + "E";
//         sb.append("l"); // str = str + "l";
//         sb.append("m");
//         sb.append("n");
//         System.out.println(sb.length());
//
//         Char at index 0
//         System.out.println(sb.charAt(0));
//         //set char at index
//         sb.setCharAt(0, 'P');
//         System.out.println(sb);
//
//         sb.insert(2, 't');
//         System.out.println(sb);
//         //delete the extra
//         sb.delete(2, 3);
//         System.out.println(sb);
//
//        StringBuilder sb = new StringBuilder("Atul");
//
//        for(int i = 0; i<sb.length()/2; i++){
//
//            int front = i;
//            int back = sb.length() - 1 - i; // 5-1-0 = 4
//
//            char frontChar = sb.charAt(front);
//            char backChar = sb.charAt(back);
//
//            sb.setCharAt(front, backChar);
//            sb.setCharAt(back, frontChar);
//
//        }
//        System.out.println(sb);
//    }
//}
