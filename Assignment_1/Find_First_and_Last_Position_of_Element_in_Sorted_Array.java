class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=helper(nums,target,true);
        ans[1]=helper(nums,target,false);
        return ans;
    }
    public int helper(int[] nums,int target,boolean left){
        int lo=0;
        int hi=nums.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                if(left){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}