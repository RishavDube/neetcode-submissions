class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int res = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                // duplicate → skip
                continue;
            } else if (nums[i + 1] == nums[i] + 1) {
                // consecutive
                count++;
            } else {
                // break in sequence
                count = 1;
            }

            res = Math.max(res, count);
        }

        return res;
    }
}
