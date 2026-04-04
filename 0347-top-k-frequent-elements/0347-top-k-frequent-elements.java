import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use max heap
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));

        maxHeap.addAll(freqMap.keySet());

        // Step 3: Extract top K
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}