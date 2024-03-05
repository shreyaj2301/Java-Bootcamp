class Method2{

    public static void main (String[] args){
        
        //Method 1
       wishes("Advika");
    
       //method 2 
       String name = "Shreesha";
       wishes(name);
       
       //method 3
       String friend = "Devyani";
       wishes(friend);
    }

    static void wishes(String name){

        System.out.println("Hello Mam  " + name);
    }
}