class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] ans=new int[26];
        int total=s1.length();
        int count=0;
        int ei=0;
        int si=0;
        while(si<=ei && ei<s2.length()){
            ans[s2.charAt(ei)-'a']++;
            if(ans[s2.charAt(ei)-'a']<=freq[s2.charAt(ei)-'a']){
                count++;
            }while( si<=ei && ans[s2.charAt(ei)-'a']>freq[s2.charAt(ei)-'a']){
                ans[s2.charAt(si)-'a']--;
                if(ans[s2.charAt(si)-'a']<freq[s2.charAt(si)-'a']){
                    count--;
                }
                si++;
            }
            if(count==total){
                return true;
            }
            ei++;

        }
        return false;
    }
}