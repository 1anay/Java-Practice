package stack;

import java.util.MissingFormatArgumentException;

public class custack {
    protected int[] data;
    private static final int defsize=10;
    int ptr=-1;

    public custack(){
        this(defsize);
    }

    public custack(int size){
        this.data=new int[size];
    }


    public boolean push(int item) throws Exception {
        if(isfull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception {
        if(isempty())
            throw new Exception("empty stack");
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isempty())
            throw new Exception("empty stack");
        return data[ptr];
    }

    boolean isfull(){
        return ptr==data.length-1;
    }
    boolean isempty(){
        return ptr==-1;
    }

}
