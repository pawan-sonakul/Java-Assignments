public class DeletePart {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java World");
        sb.delete(6, 11);
        System.out.println(sb);
    }
}
