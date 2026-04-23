class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Optimized O(n) Java Solution using Bucket Sort
Map<Integer, Integer> count = new HashMap<>(); // Freq map
List<Integer>[] bucket = new List[nums.length + 1]; // N+1 buckets
for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);
for (int num : count.keySet()) {
    int freq = count.get(num);
    if (bucket[freq] == null) bucket[freq] = new ArrayList<>();
    bucket[freq].add(num);
}
int[] res = new int[k];
int idx = 0;
for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
    if (bucket[i] != null) {
        for (int num : bucket[i]) res[idx++] = num;
    }
}
return res;



    }
}
