class codePointBefore {
    
    public static void main (String[] args){

    
        String name = "Sakshi";
        //retunr type is int
        // give the value of before the index that means if i 
       // give the index number 2
        //that is before the index no 2 that is small 'a' is value is 97
        int codepoint = name.codePointBefore(2);
        System.out.println(codepoint);
    }
}