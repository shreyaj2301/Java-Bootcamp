class Intern {
     public static void main(String[] args) {
        
        // Returns the canonical representation for the string object
        String name = "Sakshi";

        String name2 = name.intern();
        System.out.println(name2);
     }
}