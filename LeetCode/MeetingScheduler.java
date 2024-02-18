import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class MeetingScheduler {
    public List<Integer> minAvailableRooms(int[][] meetings, int n) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]); // Sort meetings based on start time
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int[] meeting : meetings) {
            int startTime = meeting[0];
            int endTime = meeting[1];

            if (!minHeap.isEmpty() && minHeap.peek() <= startTime) {
                minHeap.poll(); // This room can be reused
            }

            minHeap.offer(endTime); // Add the meeting end time to the heap

            // The number of occupied rooms at any time is the size of the heap
            result.add(minHeap.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        int n = 31; // Number of rooms
        MeetingScheduler scheduler = new MeetingScheduler();
        List<Integer> minRooms = scheduler.minAvailableRooms(meetings, n);
        System.out.println("Minimum number of rooms required at each time step: " + minRooms);
    }
}
