import java.util.Arrays;

public class SortRisk {
    public static int[] sorted(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
        }
    public static void main(String[] args) {
        

        int [] arr={1,0,2,0,1,0,2};
        sorted(7, arr);
        
    }
}
