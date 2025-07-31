public class Q8_AverageArray {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
}
