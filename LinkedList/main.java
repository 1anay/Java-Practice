package LinkedList;

import java.util.List;

public class main {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(0);
        list.insertFirst(1);
//        list.display();
//        list.insertLast(99);
//        list.insertLast(23);
//        list.display();
//        list.insert(100,3);
//        list.insert(69,5);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(100));*/
        list.recinsert(99,3);
        list.display();


        DoublyLinkedList dl =new DoublyLinkedList();
        dl.Firstinsert(8);
        dl.Firstinsert(1);
        /*dl.Firstinsert(9);
        dl.Firstinsert(20);

        dl.Lastinsert(79);
        dl.Lastinsert(15);

        dl.insertAt(1,69);*/


        CircularLinkedList cl=new CircularLinkedList();
       /* cl.insert(6);
        cl.insert(9);
        cl.insert(2);
        cl.insert(12);
        cl.display();
        cl.delete(2);
        cl.display();*/
        /*dl.deletefirst();
        dl.display();
        dl.deleteLast();*/
        /*dl.display();
        dl.delete(1,8);
        dl.display();
*/

    }
}
