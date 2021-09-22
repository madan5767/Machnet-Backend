package Question1;
import java.util.Scanner;

public class QuadraticEquationsRoots {
    private double a, b, c, determinant, squareRoot, firstRoot=0, secondRoot=0;

    public void setValues(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateDeterminant(){
        this.determinant = (b*b)-(4*a*c);
    }

    public void calculateSquareRoot(){
        this.squareRoot = Math.sqrt(determinant);
    }

    public void display(){
        if(determinant>0){
            this.firstRoot = (-b + squareRoot)/(2*a);
            this.secondRoot = (-b - squareRoot)/(2*a);
            System.out.println("Roots are : "+ firstRoot +" and "+secondRoot);
        }else if(this.determinant == 0){
            System.out.println("Root is : "+(-b + squareRoot)/(2*a));
        }else
            System.out.println("The solutions are imaginary.");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();

        QuadraticEquationsRoots qe = new QuadraticEquationsRoots();
        qe.setValues(a,b,c);
        qe.calculateDeterminant();
        qe.calculateSquareRoot();
        qe.display();
    }
}
