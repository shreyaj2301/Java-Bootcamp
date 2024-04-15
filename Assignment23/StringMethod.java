import java.util.Arrays;
class StringMethods {

    public static void main (String[] args){

        String name = "Sakshi";
        // name = name.toLowerCase();
        // name = name.toUpperCase();
        // System.out.println(name);

        // When we want to print the specific letter of the string we use the charAt method.
        // System.out.println(name.charAt(3));
        //name.charAt(4) = "t"; // We can not modify the string 

        //Using char datatype we can print the letter
        // char ch = name.charAt(4);
        // System.out.println(ch);
        
        //Using int datatype we can print the index letter 
        // int index = name.indexOf('s');
        // System.out.println(index);

         //This method used for the for separte the string 
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(ch.length); // Used for the length of char


    }
    
}