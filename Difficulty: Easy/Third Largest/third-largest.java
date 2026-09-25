class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        if(arr.size()<3){
            return -1;
        }
       int first=Integer.MIN_VALUE;
       int second=Integer.MIN_VALUE;
       int third=Integer.MIN_VALUE ;
       for  ( int i : arr){
           if(i>first){
               
               third=second;
               second=first;
               first=i;
               
           }
           else if(i>second){
               third=second;
               second=i;
           }
           else if(i>third){
               third=i;
           }
       }
       return third;
    }
}