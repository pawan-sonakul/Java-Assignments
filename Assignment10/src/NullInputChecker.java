public class NullInputChecker {
    public static void main(String[] args) {
        String greet = "Number Format Parser";

        if(greet.length() == 0) {
            throw new NullPointerException();
        }

        System.out.println(greet);
    }
}
