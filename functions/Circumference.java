import java.util.Scanner;
class Circumference {
    public static double cir(double r) {
        double c= r*2*(22d/7d);
        return c;
    }


    public static void main (String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the number");
        double r= scr.nextDouble();
        System.out.println(cir(r));
        }

}
