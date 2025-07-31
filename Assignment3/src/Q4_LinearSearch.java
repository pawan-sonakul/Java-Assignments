public class Q4_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int key = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}