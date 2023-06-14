class Solution {
    public int minStartValue(int[] nums) {
        
        int sum=0,ans=1;
        for(int i=0;i<nums.length;i++) {
            
            sum+=nums[i];
            if(sum<0)
                ans=Math.max(sum*-1+1,ans);
        }
        return ans;
    }
}