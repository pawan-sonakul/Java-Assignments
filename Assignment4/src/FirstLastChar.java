import java.util.Scanner;
public class FirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
    }
}
