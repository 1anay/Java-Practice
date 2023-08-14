package stack;

public class dynamic extends custack{
    dynamic(){
        super();
    }
    dynamic(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if(isfull()){
            throw new Exception("empty stack");
        }

        int [] temp= new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }

        data=temp;
        return super.push(item);
    }
}
