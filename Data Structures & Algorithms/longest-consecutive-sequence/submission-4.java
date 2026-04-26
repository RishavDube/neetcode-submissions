class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n : nums ) {
            numSet.add(n);
        }
        int longest = 0 ;
        
        for(int num : numSet){
        if(numSet.contains(num-1) == false){
            int count = 1 ;
            while(numSet.contains(num+count)){
                count++ ;
            }
            longest = Math.max(count , longest);
        }
        }
        return longest; 
    }
}
