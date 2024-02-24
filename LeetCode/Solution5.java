import java.util.*;

class Solution {
    public List<Integer> getSecretHolders(int n, int[][] meetings, int firstPerson) {
        // Create an adjacency list to represent the meetings
        Map<Integer, List<int[]>> adjacencyList = new HashMap<>();
        for (int[] meeting : meetings) {
            int person1 = meeting[0];
            int person2 = meeting[1];
            int time = meeting[2];
            adjacencyList.putIfAbsent(time, new ArrayList<>());
            adjacencyList.get(time).add(new int[]{person1, person2});

        }
        
        Set<Integer> secretHolders = new HashSet<>();
        secretHolders.add(firstPerson);
        
        // Perform BFS to simulate the sharing of secrets
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(firstPerson);
        
        while (!queue.isEmpty()) {
            int person = queue.poll();
            List<int[]> meetingsAtTime = adjacencyList.getOrDefault(person, Collections.emptyList());
            for (int[] meeting : meetingsAtTime) {
                int person1 = meeting[0];
                int person2 = meeting[1];
                if (!secretHolders.contains(person1)) {
                    secretHolders.add(person1);
                    queue.offer(person1);
                }
                if (!secretHolders.contains(person2)) {
                    secretHolders.add(person2);
                    queue.offer(person2);
                }
            }
        }
        
        // Convert the set of secret holders to a list and return
        return new ArrayList<>(secretHolders);
    }
}
