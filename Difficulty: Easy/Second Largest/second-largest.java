class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int largest=arr[0];
            int secondlargest=-1;
            for(int i=0;i<n;i++){
                if(arr[i]>largest){
                    secondlargest=largest;
                    largest=arr[i];
                }
                else if(arr[i] < largest && arr[i] > secondlargest) {
                    secondlargest = arr[i];
                }
            }
            return secondlargest;
    }
}