class Solution {
    public int maxTripletProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        
        int val1= arr[n-1]*arr[n-2]*arr[n-3];
        int val2= arr[0]*arr[1]*arr[n-1];
        return Math.max(val1,val2);
    }
};