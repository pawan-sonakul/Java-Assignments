public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,4};
        int[] res = new int[arr.length];

        res[0] = arr[0];

        int index = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                res[index++] = arr[i];
            }
        }

        for(int n : res) {
            if(n > 0) {
                System.out.print(n + " ");
            }

        }

    }
}
