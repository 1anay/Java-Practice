import java.util.Scanner;
class avg
{
    public static void Avg(int a,int b , int c) {
       double avg = (a+b+c)/3;
        System.out.println(avg);
    }

    public static void main (String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the three no for average");
        int a=scr.nextInt();
        int b=scr.nextInt();
        int c=scr.nextInt();
        Avg(a,b,c);

        }

}
