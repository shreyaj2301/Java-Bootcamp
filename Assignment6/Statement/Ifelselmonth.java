 class Ifelselmonth {
    public static void main(String[] args) {
        int daysInJanuary = 31;
        int daysInFebruary = 28;
        String  a;

        if (daysInJanuary < daysInFebruary) {
            a = "January";
        } else if (daysInFebruary < daysInJanuary) {
           a  = "February";
        } else {
            a= "Both months have equal number of days";
        }

        System.out.println("Month with less days: " + a);
    }
}