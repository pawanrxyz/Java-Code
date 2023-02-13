public class LL1 {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;        
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        
        Node currNode = new Node(data);
        while(currNode.next != null) {
            currNode = currNode.next;
            return;
        }
        currNode = head;
        while(currNode!= null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void main(String [] args) {

    }    
}
