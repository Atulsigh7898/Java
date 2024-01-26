import java.util.ArrayList;
import java.util.List;

public class PartitionList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);

        int pivot = 4;

        System.out.println("Original List: " + numbers);
        partitionList(numbers, pivot);
        System.out.println("Partitioned List: " + numbers);
    }

    private static void partitionList(List<Integer> list, int pivot) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            while (list.get(left) < pivot) {
                left++;
            }

            while (list.get(right) >= pivot && right > 0) {
                right--;
            }

            if (left < right) {
                // Swap elements at indices left and right
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
            }
        }
    }
}
