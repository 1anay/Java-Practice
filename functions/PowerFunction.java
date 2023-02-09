import java.util.Scanner;
class PowerFunction {
    public static void pow(int a, int b) {
        int p=1;
       for(int i=1;i<=b;i++){
           p=p*a;
       }
        System.out.println(p);
    }


    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the number ");
        int a=scr.nextInt();
        System.out.println("Enter the Power of number");
        int b=scr.nextInt();
        pow(a,b);

        }

}
