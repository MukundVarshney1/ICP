class Solution {
    public int maxSubArray(int[] nums) {
        return Maximum_sum(nums);
       
    }
    	public static int Maximum_sum(int[] ar) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}