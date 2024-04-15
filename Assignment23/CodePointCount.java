class CodePointCount {
    
    public static void main(String[] args){

        String name = "Shreya";
        
        // it give the length of string
        int count = name.codePointCount(0,name.length());
        System.out.println(count);
    }
}