package stack;

public class stackmain {
    public static void main(String[] args) throws Exception {
        custack s= new dynamic(3);
        s.push(23);
        s.push(9);
        s.push(5);
        s.push(10);


        System.out.println(s.pop());
        System.out.println( s.peek());
    }
}
