public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
int[] freq = new int[128];
 for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }
int low = 0;
int high = 0;
int req = t.length();
int minlen  = Integer.MAX_VALUE;
int start=0;

while(high<s.length()){
    char r = s.charAt(high);

    if(freq[r]>0){
        req--;
    }
    freq[r]--;
    high++;
    while(req==0){
        if(high-low<minlen){
            minlen = high-low;
            start = low;
        }
        char l = s.charAt(low);
         freq[l]++;
        if(freq[l]>0){
            req++;
        }
        low++;
    }
}
return minlen == Integer.MAX_VALUE?"":s.substring(start,start+minlen);

    }
}