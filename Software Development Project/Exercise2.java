import java.util.Scanner;

public class Exercise2{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   
    int x = 0;
    x =input.nextInt();
    int y = 0;
    y = input.nextInt();
    int z = 0;

    System.out.print("input your first number:" + x);
    System.out.print("input your second number: " + y);

    System.out.println(x + y == z );
    System.out.println(x - y == z);
    System.out.println(x * y == z);
    System.out.println();


   }
}