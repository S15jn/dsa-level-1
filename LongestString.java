import java.util.HashMap;

public class LongestString {
    public static int lengthLongestString(String s) {
        int left = 0, maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (hm.containsKey(ch)) {
                left = Math.max(left, hm.get(ch) + 1);
            }

            hm.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}