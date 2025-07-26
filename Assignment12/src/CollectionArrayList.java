import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        //add elements
        arr.add("Pawan");
        arr.add("Yash");
        arr.add("Rahul");
        System.out.println(arr);

        //update elements
        arr.set(2, "Rohan");
        System.out.println(arr);

        //clear list
        arr.clear();
        System.out.println(arr);
    }
}
