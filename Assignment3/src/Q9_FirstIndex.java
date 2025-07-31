public class Q9_FirstIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int key = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Index = " + i);
                break;
            }
        }
    }
}
