package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int defsize=10;
    int end=0;
    int front=0;
    int size=0;

    CircularQueue(){
        this(defsize);
    }
    CircularQueue(int size){
        this.data=new int[size];
    }

    public void push(int item) throws Exception {
        if(isfull()){
            throw new Exception("full circular queue");
        }
        data[end++]=item;
        end%=data.length;
        size++;
    }

    public int remove() throws Exception {
        if(isempty()){
            throw new Exception("empty circular queue");
        }
        int rem=data[front];
        front%=data.length;
        size--;
        return rem;
    }
    boolean isfull(){
        return size==data.length;
    }
    boolean isempty(){
        return size==0;
    }
}
