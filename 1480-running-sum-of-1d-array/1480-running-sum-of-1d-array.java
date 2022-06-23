class Solution {
    public int[] runningSum(int[] nums) {
int[] intArray = new int[nums.length];
      
        for(int i=1;i<=nums.length-1;i++){
                 int temp=0;
            for(int j=i;j>=0;j--){
                temp=temp+nums[j];
                    
            }
            intArray[i]=temp;
        }
          intArray[0] = nums[0];
   return intArray;
    }
}