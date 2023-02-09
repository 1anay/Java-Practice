import java.util.Scanner;
class OddSum
{
    public static void sum(int a) {
      int Sum=0;
      for(int i=1;i<=a;i++) {
          if (i % 2 != 0) {
              Sum += i;
          }
      }
        System.out.println(Sum);
    }

    public static void main (String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the number");
        int a=scr.nextInt();
        sum(a);
        }

}
