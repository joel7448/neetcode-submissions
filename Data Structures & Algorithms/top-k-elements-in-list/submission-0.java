class Solution {
    private int[] sorting(int[] nums, int k )
    {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums)
        {
            // frequency hashmap creation
            count.put(num, count.getOrDefault(num,0)+1);
        }



        // Create list [frequency, numb]
        List<int[]>arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet())
        {
            arr.add(new int[]{ entry.getValue(), entry.getKey() });
        }
        arr.sort((a,b) -> b[0] - a[0]);
        int[] res = new int[k];
        
        for(int i=0; i < k ; i++)
        {
            res[i] = arr.get(i)[1];
        }

        return res;
    }
    public int[] topKFrequent(int[] nums, int k) {
        return sorting(nums, k);
    }
}
