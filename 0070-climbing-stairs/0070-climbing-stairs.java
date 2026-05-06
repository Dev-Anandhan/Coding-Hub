class Solution {
    public int climbStairs(int n){
        int  prev = 1;
        int curr1 = 1;
         for(int i = 2;i<=n;i++){
             int curr = prev+curr1;
                curr1= prev;
                 prev = curr;
         } 
         return prev;
       
    }
}