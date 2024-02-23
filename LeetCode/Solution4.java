import java.util.*;

class Solution4 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        // Build the graph
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(new int[]{to, price});
        }
        
        // Priority queue for Dijkstra's algorithm
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Add {price, current city, remaining stops} to the priority queue
        pq.offer(new int[]{0, src, k + 1});
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int price = cur[0];
            int city = cur[1];
            int stops = cur[2];
            
            if (city == dst) return price; // Found the destination
            
            if (stops > 0) {
                List<int[]> neighbors = graph.getOrDefault(city, new ArrayList<>());
                for (int[] neighbor : neighbors) {
                    int nextCity = neighbor[0];
                    int nextPrice = neighbor[1];
                    pq.offer(new int[]{price + nextPrice, nextCity, stops - 1});
                }
            }
        }
        
        return -1; // No such route found
    }
}
