

class Solution {
    public int pivotIndex(int[] nums) {
     //get the total sum for all the array
    //which works as a right sum ;
        int totalSum=0;
          int leftSum=0;
        for(int i=0; i<nums.length ;i++){
            totalSum+=nums[i];
        }
        
        
      
        for(int i=0; i<nums.length;i++){
            //chick that the left side is not the right side .
            if(i!=0)leftSum+=nums[i-1];
            if(totalSum-leftSum-nums[i]==leftSum){
                return i;
            }
        }
        
        
        
        
        
        
        
        return -1;
        
        
        
        };
    }
