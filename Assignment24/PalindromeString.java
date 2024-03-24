class PalindromeString {

    public static void main (String[] args){

        String str = "xyzyx";
        // String reveseString = reverse(str);
        // System.out.println("Original string is :" + str);
        // System.out.println("Reverse String is : " + reveseString);
        System.out.println(ispalindrome(str));

    }

    static String reverse(String str){
       String newString = "";
       for(int i = str.length()-1; i >= 0; i--){
        newString = newString + str.charAt(i);
       }
       return newString;
    }

    static boolean ispalindrome(String str){
        String newString = "";
       for(int i = str.length()-1; i >= 0; i--){
        newString = newString + str.charAt(i);
       }
       if(newString.equals(str)){
        return true;
       }
       else{
        return false;
       }

    }
    
}