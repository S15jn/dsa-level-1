public class Palindrome{
    public static boolean isPlaindrome(String str){

        int s=0;
        int e=str.length()-1;
        while(s<=e){
          if(str.charAt(s)!= str.charAt(e)){
            return false;
          }
        }

        return  true;
    }
}