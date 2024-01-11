import java.util.*;

public class Strings {
//    public static void main(String args[]){
//       // String declaration
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("your name is :"+name);
//
//    }

    public static void main(String args[]) {
        // concatenation
//        String firstName =  "Atul";
//        String lastName  = "Singh";
//        String fullName = firstName +" "+ lastName;
//        System.out.println(fullName.length());
//
//        //charAt
//        for( int i = 0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }
        //compare
        String name1 = "Arun";
        String name2 = "Arun";

        //1 s1> s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : =ve value

//        if (name1.compareTo(name2) == 0){
//            System.out.println("String are equal");
//        }else {
//            System.out.println("String is not equal");
//        }

//        if (name1 == name2){
//            System.out.println("String are equal");
//        }else {
//            System.out.println("String is not equal");
//        }

//        if(new String("Atul")== new String("Atul")){
//            System.out.println("This is equal");
//        }else{
//            System.out.println("String is not equal");
//        }

        //new code
        String sentence = "AtulSingh";
       // substring(beg index, end index)
        String name = sentence.substring(4);
        System.out.println(name);

    }
}

