package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list= new LL();
        /*list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(0);
        list.insertFirst(1);
        list.display();
        list.insertLast(99);
        list.insertLast(23);
        list.display();
        list.insert(100,3);
        list.insert(69,5);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(100));*/


        DoublyLinkedList dl =new DoublyLinkedList();
        dl.Firstinsert(8);
        dl.Firstinsert(1);
        dl.Firstinsert(9);
        dl.Firstinsert(20);
        dl.display();
        dl.Lastinsert(79);
        dl.Lastinsert(15);
        dl.display();
        dl.insertAt(1,69);
        dl.display();
    }
}
