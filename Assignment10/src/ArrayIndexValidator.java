public class ArrayIndexValidator {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
