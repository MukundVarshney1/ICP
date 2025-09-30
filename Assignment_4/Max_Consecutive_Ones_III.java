class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0;
        int si=0;
        int ei=0;
        int ans=0;
        while(si<=ei && ei<nums.length){
            if(nums[ei]==0){
                c++;
                if(c>k){
                    while(c>k && si<=ei){
                        if(nums[si]==0){
                            c--;
                        }
                        si++;
                    }
                }
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}