class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> dups = new HashSet<>();
       for(int n: nums){
        if(dups.contains(n)){
            return true;
        }
        dups.add(n);
       }
       return false;
    }
}