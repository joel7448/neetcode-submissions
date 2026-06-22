

class TimeMap {

    

      class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        private String getValue()
        {
            return value;
        }

        private Integer getTimeStamp()
        {
            return timestamp;
        }
    }

    HashMap<String, List<Pair>> store;

    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!this.store.containsKey(key))
        {
            this.store.put(key, new ArrayList<>());
        }
        this.store.get(key).add(new Pair(value, timestamp));
        
    }
    
    public String get(String key, int timestamp) {
        // [[ "a",1 ], ["b", 2] , ]
        List<Pair> values = store.getOrDefault(key, new ArrayList<>());
        int l = 0 , r = values.size()-1;
        String res = "";
        while( l <= r)
        {
            int mid = l + ( r - l ) / 2;

            if(values.get(mid).getTimeStamp() <= timestamp)
            {
                res = values.get(mid).getValue();
                l = mid + 1; 
            }
            else
            {
                r = mid - 1;
            }
        }
        return res;
    }
}
