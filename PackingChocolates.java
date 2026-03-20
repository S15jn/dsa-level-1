class PackingChocolates {
    public static int[] isPacked(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }
        while (idx < arr.length) {
            arr[idx++] = 0;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 1, 9, 0, 5, 0 };
        isPacked(arr);

    }
}