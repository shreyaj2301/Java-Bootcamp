class CopyValue {

    public static void main(String[] args) {
        
        String name = "Shreya";
        String name2 = "Jadhav";
        // Returns a String that represents the characters of the character array
        String name3 = name.copyValueOf(name2.toCharArray());
        System.out.println(name3);


    }
    
}