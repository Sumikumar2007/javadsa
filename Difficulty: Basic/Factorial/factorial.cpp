class Solution {
  public:
    int factorial(int n) {
        // code here
        int a = 1;
        for(int i = 1; i<=n; i++ ){
            
            a*=i;
        }
        return a;
        
    }
};