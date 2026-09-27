class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int n =nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==ans){
                ans++;
            }
            else{
                break;
            }
        }
        return ans;
    }
}