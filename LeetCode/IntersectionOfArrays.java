// import java.util.*;

// public class IntersectionOfArrays {
//     public static void main(String[] args) {
//         int[] array1 = {1, 2, 2, 3, 4};
//         int[] array2 = {2, 2, 3, 5};

//         int[] intersection = findIntersection(array1, array2);
        
//         System.out.println("Intersection of the arrays: " + Arrays.toString(intersection));
//     }

//     public static int[] findIntersection(int[] array1, int[] array2) {
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         for (int num : array1) {
//             set1.add(num);
//         }

//         for (int num : array2) {
//             set2.add(num);
//         }

//         Set<Integer> intersectionSet = new HashSet<>(set1);
//         intersectionSet.retainAll(set2);

//         int[] intersectionArray = new int[intersectionSet.size()];
//         int index = 0;
//         for (int num : intersectionSet) {
//             intersectionArray[index++] = num;
//         }

//         return intersectionArray;
//     }
// }
