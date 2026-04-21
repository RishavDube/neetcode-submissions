class Solution {
    public boolean hasDuplicate(int[] nums) {
        int j = 0 ; 

        Arrays.sort(nums);

    for (int i = 0 ; i< nums.length-1 ; i++)
    {
        j = i + 1 ;
        if(nums[j] == nums[i])
        return true; 
    }
    return false;
    }
}