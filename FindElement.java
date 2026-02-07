public class FindElement {
    public static int findElementArray(int [] arr,int target){

        for (int i = 0; i < arr.length; i++) {
             if(arr[i]==target){
                return i;

             }
        }
        return -1;
    }
    public static void main(String[] args) {
      int [] arr={15,30,40,4,11,9};
      System.out.println(findElementArray(arr, 40));  
    }

}
