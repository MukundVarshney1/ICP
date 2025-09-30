class Solution {
    public List<Integer> findAnagrams(String s2, String s1) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] ans=new int[26];
        int total=s1.length();
        int count=0;
        int ei=0;
        int si=0;
        List<Integer> ll=new ArrayList<>();
        while(si<=ei && ei<s2.length()){
            ans[s2.charAt(ei)-'a']++;
            if(ans[s2.charAt(ei)-'a']<=freq[s2.charAt(ei)-'a']){
                count++;
            }
            while( si<=ei && ans[s2.charAt(ei)-'a']>freq[s2.charAt(ei)-'a']){
                ans[s2.charAt(si)-'a']--;
                if(ans[s2.charAt(si)-'a']<freq[s2.charAt(si)-'a']){
                    count--;
                }
                si++;
            }
            if(count==total){
                ll.add(ei-total+1);
            }
            ei++;

        }
        return ll;
    }
}