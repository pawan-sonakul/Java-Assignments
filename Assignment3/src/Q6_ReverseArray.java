public class Q6_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}