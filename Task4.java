import java.util.Scanner;
public class Task4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input start hours: ");
        int sh= sc.nextInt();
        System.out.println("Please input start minutes: ");
        int sm= sc.nextInt();
        System.out.println("Please input start seconds: ");
        int ss= sc.nextInt();
        System.out.println("Please input end hours: ");
        int eh= sc.nextInt();
        System.out.println("Please input end minutes: ");
        int em= sc.nextInt();
        System.out.println("Please input end seconds: ");
        int es= sc.nextInt();
        int st=(sh*3600)+(sm*60)+ss;
        int et=(eh*3600)+(em*60)+es;
        int h=(et/3600)-(st/3600);
        int m=((et%3600)/60)-((st%3600)/60);
        int s=(et-st)%60;
        double c=h*3+m*0.05+s*0.000833;
        System.out.println("Total call duration: "+h+"h "+m+"mn "+s+"s");
        System.out.println("Total cost of this call: "+c);
    }
}