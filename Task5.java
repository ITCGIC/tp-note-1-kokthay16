import java.util.Scanner;
public class Task5{
        public static void main(String args[]){
            System.out.println("Program for converting money in Riels to Dollars.");
            System.out.println("Conversion rate is : 1 USD  = 4000 RIELS");
            System.out.println("Please input money in Riels: ");
            Scanner sc= new Scanner(System.in);
            Float r= sc.nextFloat();
            Float d=r/4000;
            System.out.println(r+" Riels = "+d+" USD");
        }
}