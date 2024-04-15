class ContentEquals {
    
    public static void main(String[] args) {
        
        // Checks whether a string contains the exact same 
        //sequence of characters of the specified CharSequence or StringBuffer
    
         String name = "Hello wrold";
         String name2 = "Java";

         boolean ContentEqual = name.contentEquals(name2);

         System.out.println(ContentEqual);
    
    }
}