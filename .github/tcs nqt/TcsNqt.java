public class TcsNqt {

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int factorial(int n){
        if(n==0||n==1) return 1;
        return factorial(n)*factorial(n-1);
    }
    public static int reverseNumber(int n ){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
           ans=ans*10+rem;

        }
        return ans;
    }
    public static boolean isPalindrome(String s){
        int st=0,e=s.length()-1;
        while (st<e) {
            if(s.charAt(st)!=s.charAt(e))return false;

            
        }
        return true;
    }

    public static int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static int  fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int largestOfThree(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if( b>a && b>c){
            return b;
        }

        return c;
    }
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

    }
    public static boolean isEven(int n){
        return (n%2==0)? true : false;
    }
    public static int sumOfNNatural(int n){
        return (n*(n+1))/2;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static int countVowels(String s){
          int count=0;
          s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            
        }
        return count;

    }
    public static String reveStrings(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            
        }
       return sb.reverse().toString();
    }
    public static boolean isLeapYear(int n){
        if(n%400==0){
            return true;
        }
        if(n%4==0 && n%100!=0) return false;
        return false;
    }

    public static int sumOfElement(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] maxOrMin(int [] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
            
        }
        return new int[]{max,min};
    }
    public static void sortArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
    }

    public static int binarySearch(int arr[],int t){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
         int mid=s+(e-s)/2;
         if(arr[mid]==t){
            return mid;
         }
         else if(arr[mid]<t){
            s=mid+1;
         }
         else{
            e=mid-1;
         }
            
        }
        return -1;
    }

    public static int linearSearch(int arr[],int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t) return i;
        }
        return -1;
    }

    
    public static void main(String[] args) {
        
    }
}