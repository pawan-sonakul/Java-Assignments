public class StringLengthValidator {
    private static void validator(String userName) {
        if(!(userName.length() > 5)) {
            throw new IllegalArgumentException("Username must be at least 5 characters long");
        }
    }

    public static void main(String[] args) {
        String userName = "abc";

        validator(userName);
    }
}