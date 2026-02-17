public class MajorityElement {
    public static int majorityElements(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        int cand = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == cand) {
                count++;
            } else {
                count--;
                if (count < 1) {
                    cand = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == cand)
                count++;
        }
        if (count > arr.length / 2)
            return cand;
        return -1;

    }
}
