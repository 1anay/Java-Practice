package Queue;

public class Queue {
    protected int[] data;
    private static final int defsize=10;
    int end=0;

    Queue(){
        this(defsize);
    }
    Queue(int size){
        this.data=new int[size];
    }

    public void push(int item) throws Exception {
        if(isfull()){
            throw new Exception("full queue");
        }
        data[end++]=item;
        return;
    }

    public int remove() throws Exception {
        if(isempty()){
            throw new Exception("empty queue");
        }
        int rem=data[0];
        for (int i = 1; i <data.length ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return rem;
    }

    boolean isfull(){
        return end==data.length;
    }
    boolean isempty(){
        return end==0;
    }
}
