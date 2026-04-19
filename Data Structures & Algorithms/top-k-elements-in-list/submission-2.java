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
    private int[] bucketSort(int[] nums, int k)
    {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums)
        {
            count.put(num , count.getOrDefault(num , 0) + 1);
        }
    

        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0; i < freq.length; i++)
        {
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 ; i-- )
        {
            for(int n : freq[i])
            {
                res[index] = n;
                index++;
                if(index == k)
                {
                    return res;
                }
            }
        }
        return res;
    }
    private int[] minHeap(int[] nums, int k)
    {
        Map<Integer, Integer> count = new HashMap<>();

        for(int num:nums)
        {
            count.put(num, count.getOrDefault(num,0)+1);
        }

        // Minheap creation
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for(Map.Entry<Integer, Integer> entry : count.entrySet())
        {
            minHeap.offer(new int[] {entry.getValue() , entry.getKey()});

            if(minHeap.size() > k ) 
            {
                minHeap.poll();
            }
            System.out.println(minHeap.size());
        }

        int[] res = new int[k];

        for(int i=0; i < k ; i++)
        {
            res[i] = minHeap.poll()[1];
        }

        return res;
    }
    public int[] topKFrequent(int[] nums, int k) {
        // return sorting(nums, k);
        // return minHeap(nums,k);
        return  bucketSort(nums, k);
    }
}
