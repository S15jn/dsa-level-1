public class SortColors {
  public static void sorts(int[] arr)  {
    //bubble sort
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if( arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
  } 

  public static void swap(int []arr, int mid,int high){
    int temp=arr[mid];
    arr[mid]=arr[high];
    arr[high]=temp;
  }
  public static void dutchNationalFlag(int [] arr){
    int low=0,mid=0,high=arr.length-1;
    while(mid<=high){
        if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
            swap(arr,mid,high);
            
            high--;
        }
    }


  }
}
