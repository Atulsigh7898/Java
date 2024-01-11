public class Recursion3 {

    // print all the permutation of a string
//    public static void printpermutations(String str, String permutation){
//       if(str.length() == 0){
//           System.out.println(permutation);
//           return;
//       }
//        for(int i= 0; i<str.length(); i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0, i)+str.substring(i+1);
//            printpermutations(newStr, permutation+currChar);
//        }
//
//    }
//    public static void main(String args[]){
//        String str = "abc";
//        printpermutations(str, "");
//    }

    //count the path in a maze to move from(0,0) to (n,m)
//    public static int countPaths(int i, int j, int n, int m){
//        if(i == n|| j ==m){
//            return  0;
//        }if(i == n-1 && j == m-1){
//            return 1;
//        }
//        int downpaths = countPaths(i+1, j, n, m);
//        int rightpath = countPaths(i, j+1, n, m);
//        return downpaths+rightpath;
//    }
//    public static void main(String args[]){
//        int n =3, m = 3;
//        int totalpath = countPaths(0, 0, n, m);
//        System.out.println(totalpath);
//    }

    //plsace tiles od size 1xm in a floor of size

//    public static int placeTiles(int n, int m){
//        if(n == m){
//            return 2;
//        }
//        if(n<m){
//            return 1;
//        }
//        //vertically
//        int verticalpalcement = placeTiles(n-m, m);
//        //horizontally
//        int horizontalpalcment = placeTiles(n-1, m);
//        return verticalpalcement + horizontalpalcment;
//    }
//    public static void main(String args[]){
//       int n =4, m = 2;
//        System.out.println(placeTiles(n, m));
//    }

    //find the number of ways in whichn you can invite n people to your party single or in pair's

//    public static int callGuest(int n){
//        if(n<=1){
//            return 1;
//        }
//        //single
//        int ways1 = callGuest(n-1);
//        //pair
//        int ways2 = (n-1) * callGuest(n-2);
//
//        return ways1 + ways2;
//    }
//    public static void main(String args[]){
//        int n =4;
//        System.out.println(callGuest(n));
//    }

    //print all the subset of a set of first n natural numbers
//    public static void printsubset(ArrayLists<Integer> subset){
//        for(int i =- 0; i<subset.size(); i++){
//            System.out.print(subset.get(i) +" ");
//        }
//        System.out.println();
//    }
//    public static void findsubset(int n, ArrayLists<Integer> subset){
//        if(n == 0){
//            printsubset(subset);
//            return;
//        }
//
//        subset.add(n);
//        findsubset(n-1, subset);
//
//        subset.remove(subset.size()-1);
//        findsubset(n-1, subset);
//    }
//
//    public static void main(String args[]){
//        int n = 3;
//        ArrayLists<Integer> subset =  new ArrayLists<>();
//        findsubset(n, subset);
//    }
}
