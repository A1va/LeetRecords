class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        next = null;
    }
}
class MyLinkedList {

    int size;
    Node head;
    Node tail;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node ret = head;
        for (int i = 0; i< index; i++)
            ret = ret.next;
        return ret.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
//         error!
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (size == 0) {
            tail = newNode;
        }
        size ++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size ++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if (index == size) addAtTail(val);
        else if (index <= 0) addAtHead(val);
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if(size == 1) tail = head;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if (index == size - 1) tail = temp;
            else
                temp.next = temp.next.next;
        }
        size--;
    }
}