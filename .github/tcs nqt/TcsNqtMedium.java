import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class TcsNqtMedium {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> hm = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hm.contains(arr[i])) {
                hm.add(arr[i]);
                arr[idx++] = arr[i];
            }

        }
        return arr;

    }

    public static int[] movesZeroToEnd(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }
        while (idx < arr.length) {
            arr[idx++] = 0;

        }
        return arr;
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static int[] leftRotateByK(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;

    }

    public static int[] rightRotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return arr;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums1) {
            hs.add(num);

        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int n : nums2) {
            if (hs.contains(n) && !al.contains(n)) {
                al.add(n);
            }
        }
        int[] res = new int[al.size()];
        int idx = 0;
        for (int n : al) {
            res[idx++] = n;

        }
        return res;
    }

    public static int countValidWords(String sentence) {
        Stack<Character> st = new Stack<>();
        int n = sentence.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);

            if (Character.isWhitespace(ch)) {
                if (!st.empty()) {
                    count++;
                }
                while (!st.empty()) {
                    st.pop();
                }

            }

            if (Character.isAlphabetic(ch)) {
                st.push(ch);
            }
            if (!Character.isLetterOrDigit(ch)) {
                if (!st.isEmpty() && Character.isWhitespace(sentence.charAt(i + 1))) {
                    st.add(ch);
                }
            }
            if (Character.isDigit(ch)) {
                while (!(Character.isWhitespace(ch))) {
                    i++;
                }
            }

        }
        return count;
    }

    public static ArrayList<Integer> missingNumber(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[arr.length];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1 && arr[i] <= n) {
                present[arr[i] - 1] = true;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < present.length; index++) {
            if (!present[index]) {
                al.add(index + 1);
            }

        }
        return al;
    }

    public static String removeDuplicateString(String s) {
        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!hs.contains(ch)) {
                hs.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static String stringCompresion(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;

            } else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;

            }

        }
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        return sb.toString();
    }
    public static String  toggleCse(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
            
        }
        return sb.toString();
    }
    // public static String longestWord( String s){
    //     Stack<Character> st=new Stack<>();
    //     int max=0;
    //     StringBuilder sb=new StringBuilder();
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch= s.charAt(i);
    //         if(!Character.isWhitespace(ch)){
    //             st.push(ch);

    //         }else{
    //             max=Math.max(max,st.size());
                
    //         }
            
    //     }
    // }

    public static String replaceWhiteSpaces(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch)){
                sb.append("%20");
                
            }
            else{
                sb.append(ch);
            }
            
        }
        return sb.toString();
    }
}
