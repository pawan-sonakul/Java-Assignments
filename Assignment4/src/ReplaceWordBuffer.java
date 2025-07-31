public class ReplaceWordBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I like Python");
        int start = sb.indexOf("Python");
        sb.replace(start, start + 6, "Java");
        System.out.println(sb);
    }
}
