import java.util.Arrays;

class MaxAndMin{
    public static int[] maxAndMin(int [] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min,max};
    }
    //2 ways --using arrays sorted
    public static int[] minAndMax(int []arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}