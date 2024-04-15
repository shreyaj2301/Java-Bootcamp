class Format {
    
    public static void main(String[] args) {
        // Returns a formatted string using the specified locale, format 
        // string, and arguments

        String name = "Hello world";
        String name2 = "java";

        String name3 = name.format(name2);
        System.out.println(name3);
    }
}