class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                /*
                 * 当且仅当发现 nums[i] != val 时，把这个值赋值到 res 指向的位置
                 * 保证数组前 res 个数符合要求
                 */
                nums[res++] = nums[i];
            }
        }
        System.out.print(Arrays.toString(nums));
        return res;
    }
}