public class ReverseString {
    public static String reverseStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("Hello World"));
    }
}
