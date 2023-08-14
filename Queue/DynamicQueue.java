package Queue;

public class DynamicQueue extends CircularQueue{
    DynamicQueue(){
        super();
    }
    DynamicQueue(int size){
        super(size);
    }
    @Override
    public void push(int item) throws Exception {
        if(isfull()){
         int [] temp=new int[data.length*2];

            for (int i = 0; i <data.length; i++) {
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end= data.length;
            data=temp;

        }
        super.push(item);
    }
}
