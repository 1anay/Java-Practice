package LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public Node find(int val){
        Node t=head;
        while(t!=null){
            if(t.value==val)
                return t;
            t=t.next;
        }
        return null;
    }

    public void Firstinsert(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head= node;
    }
    public void insertAt(int after,int val){
        Node node= new Node(val);
        Node p=find(after);
        if(p==null){
            System.out.println("error in first value you entered");
            return;
        }
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)
            node.next.prev=node;
    }

    public void Lastinsert(int val){
        Node node= new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head= node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.value +" ~> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("end");

        System.out.println("In Reverse");
        while(last!=null){
            System.out.print(last.value +" ~> ");
            last=last.prev;
        }
        System.out.println("End");
    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
