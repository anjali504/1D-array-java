public class palindromSting {
    public static  boolean  isPalindrome(String str)  {  
        int n = str.length(); 
        
        // Loop to check if string is palindrome or not  
        for (int i=0; i<n/2; i++) {  
            if(str.charAt(i) !=  str.charAt(n-1-i)){
               ///not 
               return false;
            }  
        } 
        return true;
    }
    

    public static void main(String[] args) {
        String str = "madammmm";
        System.out.println(isPalindrome(str)) ;// Output: True
    }
    
}
