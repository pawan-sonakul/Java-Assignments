public class Q3_MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}