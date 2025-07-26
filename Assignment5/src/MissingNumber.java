public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,4};
        int n = arr.length + 1;
        int totalSum = (n * (n - 1)) / 2;

        int arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        System.out.println("Missing number: " + (totalSum - arrSum));

    }
}
