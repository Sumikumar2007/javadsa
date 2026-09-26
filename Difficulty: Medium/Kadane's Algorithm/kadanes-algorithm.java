class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int bestsum=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=bestsum+arr[i];
            int v2=arr[i];
            bestsum=Math.max(v1,v2);
            ans=Math.max(bestsum,ans);
        }
        return ans;
    }
}
