import java.util.Scanner;
class PrintGreaterNumber {
    public static int great(int a,int b) {
        int x=a<b?b:a;
        return x;
    }


    public static void main (String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the number");
        int a=scr.nextInt();
        int b=scr.nextInt();
        System.out.println(great(a,b));
        }

}
