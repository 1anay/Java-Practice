package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size=0;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.value +" ~> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //traverse the linked-list
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp= temp.next;
        }

        return temp;
    }

    public int find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value== value)
                return value;
            temp=temp.next;
        }
        return -01;
    }

    public void insertFirst(int val){
        Node node1= new Node(val);
        node1.next=head;
        head= node1;
        if(tail == null)
              tail = head;
        size++;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index== size){
            insertLast(val);
            return;
        }
        Node temp= get(index-1);
        Node nodei= new Node(val,temp.next);
        temp.next= nodei;
        size++;
    }

    public void insertLast(int val){
        if(tail== null)
                return;
        Node node=new Node(val);
        tail.next= node;
        tail=node;
        size++;
    }
    public void recinsert(int val, int index){
        head=rec(val,index,head);
    }
    private Node rec(int val, int index, Node node){
        if(index==0){
            Node temp= new Node(val,node);
            size++;
            return temp;
        }
        node.next=rec(val,index-1,node.next);
        return node;
    }

    public int deleteFirst(){
        int val =head.value;
        head=head.next;
        if(head == null)
            tail= null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0)
            return deleteFirst();
        if(index==size-1)
            return deleteLast();

        Node temp=get(index-1);
        int val=temp.next.value;
        temp.next=temp.next.next;

        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node temp= get(size-2);
        int val= temp.next.value;
        tail=temp;
        tail.next=null;

        size--;
        return val;
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

