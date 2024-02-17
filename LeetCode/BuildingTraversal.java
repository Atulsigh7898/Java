import java.util.PriorityQueue;

public class BuildingTraversal {
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> ladderGaps = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            int gap = heights[i + 1] - heights[i];
            if (gap > 0) {
                if (ladders > 0) {
                    ladderGaps.offer(gap);
                    ladders--;
                } else if (!ladderGaps.isEmpty() && gap > ladderGaps.peek()) {
                    bricks -= ladderGaps.poll();
                    ladderGaps.offer(gap);
                } else {
                    bricks -= gap;
                }
                if (bricks < 0) return i;
            }
        }

        return heights.length - 1;
    }

    public static void main(String[] args) {
        BuildingTraversal buildingTraversal = new BuildingTraversal();
        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;
        System.out.println("Furthest building reached: " + buildingTraversal.furthestBuilding(heights, bricks, ladders));
    }
}
