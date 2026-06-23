class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
    // extracting the map entries.
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

       //sorting the list in descending
       Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
        @Override
        public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
            return b.getValue().compareTo(a.getValue());
        }
       }

       //we can also write this instead of whole collection.sort
       //list.sort((a,b)->b.getValue().compareTo(a.getValue())
 );
    int[] res = new int[k];
    for(int i=0;i<k;i++){
        res[i]=list.get(i).getKey();
    }
    return res;
}
}