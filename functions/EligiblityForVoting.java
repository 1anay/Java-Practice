import java.util.Scanner;
class EligiblityForVoting {
    public static String vote(int age) {
        if(age >18){
            return "is eligible to vote";
        }
        else
            return "is not eligible to vote";
    }


    public static void main (String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter the age: ");
        int age=scr.nextInt();
        System.out.println(vote(age));
        }

}
