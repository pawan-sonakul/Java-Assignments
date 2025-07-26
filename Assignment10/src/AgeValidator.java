public class AgeValidator {
    private static void validator(int age) {
        if(age >= 18) {
            System.out.println("Age: " + age);
        } else {
            throw new IllegalArgumentException("Age must be 18 or older to vote");
        }
    }

    public static void main(String[] args) {
        int age = 20;

        validator(age);
    }
}