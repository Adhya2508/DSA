class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int l=0;
        int r=0;
        int c=0;
        while(r<len){
            boolean rep=false;
            for(int i=l;i<r;i++){
                if(s.charAt(i)==s.charAt(r)){
                    l=i+1;
                    rep=true;
                    break;
                }
            }
            c=Math.max(c,r-l+1);
            r++;
        }
        return c;
    }
}
