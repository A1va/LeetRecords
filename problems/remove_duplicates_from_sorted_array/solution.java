class Solution {
    public int removeDuplicates(int[] nums) {
    //     if(nums == null || nums.length == 0) return 0;
    //     int p = 0;
    //     int q = 1;
    //     /**  
    //         1 1 3 4 5
    //         p q
    //      */
    //     while(q < nums.length){
    //         /**
    //             1 1 3 4 5
    //             p   q
    //          */
    //         if(nums[p] != nums[q]){
    //             /**
    //                 0 1 2 3 4 5
    //                 避免重复复制 p - q > 1
    //              */
    //             if(q - p > 1){
    //                 nums[p + 1] = nums[q];
    //             }
    //             p++;
    //         }
    //         /**
    //             0 1 2 3 4 2 2 3 3 4
    //                     p           q
    //          */
    //         q++;
    //     }
    //     // p 从0开始计数
    //     return p + 1;
        if(nums == null || nums.length == 0) return 0;
        int k = 1;
        int count = k;
        for(int i = k; i < nums.length; i++) {
            if(nums[i] != nums[count - k]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}