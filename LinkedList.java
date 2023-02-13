import java.util.Scanner;
public class LinkedList { 
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this .data = data;
            this.next = null;            
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty:");
            return;
        }
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String [] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // // ll.printList();
        // ll.printList();
         
        int ch;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Choice ");
            ch = sc.nextInt();

            switch(ch) {
                case 1: ll.addFirst(2);
                        ll.printList();
                break;
                case 2: System.out.println("There is no elements of linkedlist:");
                break;
                default:  System.out.println("This is your wrong choice please enter your correct choice: thank you!");
            }
            sc.close();
        }while(ch <3);
        
    }    
}
