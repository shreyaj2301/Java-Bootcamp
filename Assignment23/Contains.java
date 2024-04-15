class Contains {
    
    public static void main(String[] args) {
        
        String  str = "Hello, World !";
        
        boolean containsSubString1 = str.contains("Hello");
        boolean containsSubString2 = str.contains("Java");

        System.out.println(containsSubString1);
        System.out.println(containsSubString2);
    }
}