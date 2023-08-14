package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void display() {
    Node t=head;
        if (head != null) {
            do {
                System.out.print(t.value + " ~> ");
                t = t.next;
            } while (t != head);
            System.out.println("END");
        }
    }

    public void insert(int val){
        Node node= new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        head=node;
    }

    public void delete(int val){
        Node t= head;
        if(t==null)
            return;
        if(t.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=t.next;
            if(n.value==val){
                t.next=n.next;
            }
            t=t.next;
        }while(t!=head);
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
