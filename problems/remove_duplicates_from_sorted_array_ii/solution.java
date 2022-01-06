class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 2;
        if(nums.length <= k) return nums.length;
        int count = k;
        for(int i = k; i < nums.length; i++) {
            if(nums[i] != nums[count - k]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}