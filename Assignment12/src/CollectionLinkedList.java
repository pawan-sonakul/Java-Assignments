import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //add elements
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(1, 1000);
        System.out.println(linkedList);

        //remove element
        linkedList.remove(0);
        System.out.println(linkedList);

        //get elements
        System.out.println(linkedList.get(1));
    }
}
