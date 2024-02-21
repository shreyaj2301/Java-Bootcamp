 
//Write a program to print 'a' - 'z' and also 'A'-'Z'.

 class Question5 {
    public static void main(String[] args) {
        System.out.println("Lowercase alphabets:");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\nUppercase alphabets:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}
