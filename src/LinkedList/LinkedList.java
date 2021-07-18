package LinkedList;

public class LinkedList {
    Node head;
    int size;

    public void add(int data){
        if(head == null){
            head = new Node(data);
            size += 1;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        size += 1;
    }

    public int getSize(){
        return size;
    }

    public void add(int data, int index){
        if (index > getSize()){
            return; //invalid position
        }

        Node current = head; //iterate through whole list
        int pos = 0;
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size += 1;
            return;
        }
        while (current.next != null){
            if (pos == index-1){
                break;
            }
            pos++;
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size += 1;
    }

    public void remove(int index){
        Node current = head;
        Node prev = null;
        int pos = 0;
        if (getSize() == 0){
            return; //list is empty
        }
        if (index == 0 && current.next != null){
            head = head.next;
            size -= 1;
            return;
        }
        if (index == 0 && getSize() == 1){
            head = null;
            size = 0;
        }
        else {
            while (current != null && pos != index){
                prev = current;
                current = current.next;
                pos++;
            }
            prev.next = current.next;
            size -= 1;
        }

    }

    public void print(){
        if (getSize() == 0){ //list is empty
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data + "\n");
    }
}
