class LL1 {
    Node head;  // first node (start of list)

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // if head itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;  // not found

        prev.next = temp.next;
    }

    // Search an element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}



public class linkedlist_practice{
public static void main(String[] args) {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();   // 10 -> 20 -> 30 -> NULL

        list.insertAtBeginning(5);
        list.display();   // 5 -> 10 -> 20 -> 30 -> NULL

        list.deleteNode(20);
        list.display();   // 5 -> 10 -> 30 -> NULL

        System.out.println("Is 30 present? " + list.search(30)); // true
        System.out.println("Is 40 present? " + list.search(40)); // false
    }
}

    
}
