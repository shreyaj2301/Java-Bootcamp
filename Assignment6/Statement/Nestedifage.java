class Nestedifage {
    public static void main(String[] args) {
        int age = 25;
        String gender = "male";

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (gender.equals("male")) {
                System.out.println("You are a man.");
            } else {
                System.out.println("You are a woman.");
            }
        } else {
            System.out.println("You are a minor.");
            if (gender.equals("male")) {
                System.out.println("You are a boy.");
            } else {
                System.out.println("You are a girl.");
            }
        }
    }
}