
class age_ifelse {
    public static void main(String[] args) {
        int age;
        age = 35;
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age >= 18 && age < 21) {
            System.out.println("You are an adult");
            System.out.println("You are going to become an adult!");
        } else if (age >= 21 && age < 60) {
            System.out.println("You are an adult");
            System.out.println("You are going to get a job!");
        } else if (age >= 60 && age < 100) {
            System.out.println("You are going to retire!");
        } else {
            System.out.println("You are young");
        }
    }
 {
}
}
