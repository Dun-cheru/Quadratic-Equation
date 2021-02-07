import java.util.Scanner;


public class QuadraticEquation{

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        //Declare Variables
        double a = 1;
        double b = 6;
        double c = 12;

        double disc = 0; //Stores a temporary value to check
        double x1 = 0;
        double x2 = 0;
        
        //Take Inputs
        System.out.println("Input the value of a, b and c for ax^2+bx+c= 0");
        System.out.print("Input the value of a: ");
        a = s.nextDouble();
        System.out.print("Input the value of b: ");
        b = s.nextDouble();
        System.out.print("Input the value of c: ");
        c = s.nextDouble();

        //Process Inputs
        disc = Math.pow(b,2)-4*a*c;
        if (disc > 0){

            x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        //output results
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if (disc == 0){
            x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("There is one real root at x = "+x1);
        }
        else{
            System.out.println("There are no real roots");
        }
    }
}