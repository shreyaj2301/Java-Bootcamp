class Matches {
    
    public static void main(String[] args) {
        
        // Searches a string for a match against a regular expression, 
        // and returns the matches
        
        String name = "Hello";

        boolean name2 = name.matches(name);
        System.out.println(name2);
    }
}