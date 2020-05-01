
import java.util.Scanner;

public class Exercise3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
   
        int x = 0;
        x = input.nextInt();
        int y = 20;

        System.out.print("Please enter a number: " + x);

        if (x > y){
            System.out.print("this number is greater then your age");
            System.out.println();

        }else if(x > y){
            System.out.print("this number is less then your age");
        
        }else (x == y){
            System.out.print("this number is equal to your age");
        }

        System.out.println();



   }
}