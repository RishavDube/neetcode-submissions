class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevElement = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++)
        {
        int complement = target - nums[i];
        if(prevElement.containsKey(complement))
        {
            return new int[] {prevElement.get(complement),i};
        }
        prevElement.put(nums[i], i);
        }
        return new int[] {};
    }
}