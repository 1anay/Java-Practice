import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the arrays");
        for(int i= 0;i<arr.length;i++){
            arr[i]=scr.nextInt();
        }
        System.out.println("Enter the no. to be searched");
        int num=scr.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Found the no. at the index: "+ i);
            }
        }
        System.out.println("The entered number is not present");
    }
}