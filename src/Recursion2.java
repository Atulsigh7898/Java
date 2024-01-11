import java.util.HashSet;
import java.util.*;
public class Recursion2 {

//    public static void towerHanoi(int n, String src, String halper, String dest){
//        if(n == 1){
//            System.out.println("tresnfer dist "+ n + " from "+ src + " to " + dest);
//            return;
//        }
//        towerHanoi(n-1, src, dest, halper);
//        System.out.println("tresnfer dist "+ n + "from"+ src + "to" + dest);
//        towerHanoi(n-1, halper, src, dest);
//    }
//    public static void main(String args[]){
//        int n = 3;
//        towerHanoi(n, "D", "H", "D");
//    }

    //print the string in revers

//    public static void printRev(String str, int idx){
//        if (idx == 0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printRev(str, idx-1);
//    }
//
//    public static void main(String args[]){
//
//        String str = "abcd";
//        printRev(str,str.length()-1);
//    }

    //find the first and last occurance of an element

//    public static int first = -1;
//    public static int last = -1;
//    public static void findOccurance(String str, int idx, char element){
//        if(idx == str .length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//                if(currChar == element){
//                    if(first == -1){
//                        first = idx;
//                    }else{
//                        last = idx;
//                    }
//                }
//                findOccurance(str, idx+1, element);
//    }
//
//    public static void main(String args[]){
//
//        String str = "abaacdaefaah";
//        findOccurance(str, 0, 'a');
//    }


    // chack if an array is scalerd (String incresing)

//    public static boolean isSorted(int arr[], int idx) {
//        if (idx == arr.length-1) {
//            return true;
//        }
//        if (arr[idx] >= arr[idx + 1]) {
//            return false;
//        }
//        return isSorted(arr, idx+1);
//    }
//    public static void main(String args[]){
//
//        int arr[] = {1, 2, 2};
//        System.out.println(isSorted(arr, 0));
//    }

    // move all the "x" to the end of the string

//    public static boolean[] map = new boolean[26];
//    public static void removeDuplicate(String str, int idx, String newString){
//        if(idx == str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar - 'a']){
//            removeDuplicate(str, idx+1, newString);
//
//        }else {
//            newString += currChar;
//            map[currChar -'a'] = true;
//            removeDuplicate(str, idx+1, newString);
//        }
//    }
//    public static void main(String args[]){
//        String str = "abbccda";
//        removeDuplicate(str, 0, " ");
//    }

    // print all the subsequence of string


//    public static void subsequences( String str, int idx, String newString){
////        if (idx == str.length()){
////            System.err.println(newString);
////            return;
////        }
////        char currChar = str.charAt(idx);
////        subsequences(str, idx+1, newString+currChar);
////        //to be
////
////        subsequences(str, idx+1, newString);
////        //or not to be
////
////    }
////    public static void main(String args[]){
////        String str = "abc";
////        subsequences(str, 0, "");
////    }

    //Print the all unique subsequence of a string
//    public static void subsequences( String str, int idx, String newString, HashSet<String>set){
//        if (idx == str.length()){
//            if(set.contains(newString)){
//                return;
//            }else{
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//
//        }
//        char currChar = str.charAt(idx);
//
//        subsequences(str, idx+1, newString+currChar, set);
//        //to be
//
//        subsequences(str, idx+1, newString, set);
//        //or not to be
//
//    }
//    public static void main(String args[]){
//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        subsequences(str, 0, "", set);
//    }

    // print the mobile keyped combination

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vws", "yz"};
    public static void printcomb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i = 0 ; i<mapping.length(); i++){
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String args[]){
        String str ="23";
        printcomb(str, 0, "");
    }


}
