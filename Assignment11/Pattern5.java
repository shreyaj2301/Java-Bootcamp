  //*
 // **
 // ***
 // ****
  //*****
 // ****
 // ***
 // **
//  *

class Pattern5{

    public static void main (String[] args){
      int n =5;
        for (int i = 0; i < n; i++) { // for loop for normal triangle
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) { // for loop for reverse triangle
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
    
