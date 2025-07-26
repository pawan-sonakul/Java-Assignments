public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            int j;
            for(j = 1; j <= i - 1; j++) {
                System.out.print(j);
            }

            for(int k = j; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
