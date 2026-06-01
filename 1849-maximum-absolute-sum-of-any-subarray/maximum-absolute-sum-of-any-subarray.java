class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int max_end=nums[0];

        int max_sum=nums[0];
        int min_end=nums[0];
        int min_sum=nums[0];
        for(int i=1;i<n;i++){
            int v1=nums[i];
            int v2=max_end+nums[i];
            max_end=Math.max(v1,v2);
            max_sum=Math.max(max_end,max_sum);
            int v3=min_end+nums[i];
            min_end=Math.min(v1,v3);
            min_sum=Math.min(min_end,min_sum);
            
        }
        return Math.max(Math.abs(max_sum), Math.abs(min_sum));
    }
}
