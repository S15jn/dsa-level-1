import java.util.HashMap;

public class Anagrams {
    public static boolean isAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!hm.containsKey(ch))
                return false;
            else {
                hm.put(ch, hm.getOrDefault(ch, 0) - 1);
                if (hm.get(ch) < 1) {
                    hm.remove(ch);
                }
            }

            return hm.isEmpty();
        }
    }
}
