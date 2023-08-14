package Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue s= new DynamicQueue(3);
        s.push(23);
        s.push(9);
        s.push(5);
        s.push(10);


        System.out.println(s.remove());

    }
}
