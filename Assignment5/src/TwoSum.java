public class TwoSum {
    public static void main(String[] args) {
        int tar = 9;
        int[] arr = {2,7,11,15};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] + arr[i] == tar) {
                    System.out.print(i + ", " + j);
                }
            }
        }
    }
}
