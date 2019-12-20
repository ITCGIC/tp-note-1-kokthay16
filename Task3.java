import java.util.Scanner;
public class Task3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input hours: ");
        int h = sc.nextInt();
        System.out.println("Please input minutes: ");
        int m = sc.nextInt();
        System.out.println("Please input seconds: ");
        int s = sc.nextInt();
        int ts= (h*3600)+(m*60)+s;
        
       System.out.println("Number of Seconds= " +h+"*3600 + " +m+"*60+ " +s+" = " +ts);
    }
}