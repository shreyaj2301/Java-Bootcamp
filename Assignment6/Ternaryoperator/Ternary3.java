 class Ternary3
 {
    public static void main(String[] args) {
        int year = 2024;
        String leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? "Leap year" : "Not a leap year";
        System.out.println(leapYear);
    }
}