class ReverseString {
    
    public static void main (String[] args){

        // String str = "Sakshi Dhanshree Shreya ";
        // // System.out.println(newString);

        // str = reverse(str);
        // System.out.println("original string: " + str);

        StringBuilder str = new StringBuilder("Dhanshree");
        str.reverse();
        System.out.println(str);

    }

    static String reverse(String str){
        
        String newString = "";

        for(int i = str.length() - 1; i>=0; i--){
            newString = newString + str.charAt(i);
        }

        return newString;

    }
}
