class offsetByCodePoints {
    
    public static void main(String[] args) {
        // Returns the index within this String that is offset from the given
        //  index by codePointOffset code points

        String name = "Hello";

        int flag = name.offsetByCodePoints(1, 2);

        System.out.println(flag);
    }
}