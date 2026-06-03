class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int ans=0;
        HashMap<Integer, Integer> f = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=zero-one;
            if(diff==0){
                ans=Math.max(ans,i+1);
            }
            if(!f.containsKey(diff)){
                f.put(diff,i);
            }
            else{
                int index=f.get(diff);
                int len=i-index;
                ans=Math.max(len,ans);
            }
            
        }
        return ans;

    }
}