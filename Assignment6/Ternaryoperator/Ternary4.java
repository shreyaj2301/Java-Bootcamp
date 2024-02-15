 class Ternary4{
    public static void main(String[] args) {
        int marks = 75;
        char Rank = (marks >= 90) ? 'A' : (marks >= 80) ? 'B' : (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';
        System.out.println("Rank: " + Rank);
    }
}