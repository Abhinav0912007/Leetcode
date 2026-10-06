import java.util.ArrayList;

class Solution {
    public int strStr(String haystack, String needle) {

        ArrayList<Character> list = new ArrayList<>();

        for (int k = 0; k < needle.length(); k++) {
            list.add(needle.charAt(k));
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < list.size() &&
                   haystack.charAt(i + j) == list.get(j)) {
                j++;
            }

            if (j == list.size()) {
                return i;
            }
        }

        return -1;
    }
}