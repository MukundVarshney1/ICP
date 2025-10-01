class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=0;
        int ans=0;
        for(int i=people.length-1;i>=j;i--){
            if(people[i]+people[j]<=limit){
                j++;
                ans++;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}