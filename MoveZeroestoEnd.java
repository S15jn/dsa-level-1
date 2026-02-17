public class MoveZeroestoEnd {
    public static void moveZeroestoEnd(int [] arr){
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
        while(idx!=arr.length){

            arr[idx]=0;
            idx++;
        }
    }
}
