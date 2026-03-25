class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum =0;
         for(int num: nums){
            totalsum += num;

         }
         int lefttotal = 0;
          for(int i =0;i<nums.length;i++){
             int righttotal = totalsum - lefttotal-nums[i];
            if(righttotal == lefttotal){
                
            
            return i;
            }
            lefttotal += nums[i];

        }
        return -1;

        
     }
}