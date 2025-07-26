public class SegregationOfPosNeg {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,-11,234,1,-214,123,-21,-123};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int n : arr) System.out.println(n);
    }
}
