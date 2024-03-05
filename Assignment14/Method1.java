class Method1{

    public static void main (String[] args){


      int remaining = Dhanshree(150);
      System.out.println("Aai got money back from Shreesha");

    }

    static int Dhanshree(int money){

        int price = 90;
        System.out.println("Bhaji gheun aali");
        int remaining = money - price;
        System.out.println(remaining+ " " + "Evde Paise rahile ahet");
        return remaining;
    }
}