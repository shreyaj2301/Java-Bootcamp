class SubString {
    
    public static void main(String[] args) {
        
        // Returns a new string which is the substring of a specified string
        
        String name = "Hello";

        CharSequence name2 = name.subSequence(1, name.length());
        System.out.println(name2);
    }
}