package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.print();
        linkedList.add(4,1);
        linkedList.print();
        linkedList.add(4,7); //invalid index
        linkedList.add(8,3);
        linkedList.print();
        System.out.println(linkedList.getSize());
        linkedList.remove(2);
        linkedList.print();
        linkedList.remove(1);
        linkedList.print();
        linkedList.remove(0);
        linkedList.print();
    }
}
