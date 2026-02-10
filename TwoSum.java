class TwoSum{
    public static int[] twoSum(int [] arr,int target){
       int s=0,e=arr.length-1;
       int [] res=new int[2];
       while(s<e){
        if(arr[s]+arr[e]==target){
            res[0]=arr[s];
            res[1]=arr[e];
        } 
         s++;
         e--;
       }

       return res;
    }
}