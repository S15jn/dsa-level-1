class SpanArray {
    public static int spanArrays(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 15, 30, 40, 4, 11, 9 };
        System.out.println(spanArrays(arr));
    }
}