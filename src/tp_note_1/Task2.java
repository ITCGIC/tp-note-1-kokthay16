import java.util.Scanner;
public class Task2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input seconds: ");
        int ts = sc.nextInt();
        int h=ts/3600;
        int m=(ts%3600)/60;
        int s=ts-(h*3600)-(m*60);
        
        System.out.println("Time corresponding to " +ts+"seconds is " +h+":" +m+":" +s);
    }
}