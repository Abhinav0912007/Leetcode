class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String Str = s+s;
        if(Str.contains(goal)){
            return true;
        }
        return false;
    }
}