class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        int[] topK = new int[k];
        Map<Integer, Integer> count = new HashMap();

        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        count.forEach((key,v) -> {
            if (buckets[v] == null) {
                buckets[v] = new ArrayList<>();
            }

            buckets[v].add(key);
        });

        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    topK[index] = num;
                    index++;
                    
                    if (index == k) {
                        return topK;
                    }
                }
            }
        }
        return topK;
    }
}
