import java.util.Scanner;
/* A program to calculate the area of plane figures

 */
 /* common plane figures
    circle
    square
    triangle
    trapezium
    rectangle
     */


public class Calculation {


    public static void displayMenu(){
        String[] planeFigures = new String[]{"Circle", "Rectangle", "Triangle", "Trapezium", "Square"};
        // Displaying available plane figure options

        System.out.println("=========================================\n");
        System.out.println("Some plane figures options available for selection");
        for(int i =0; i< planeFigures.length; i++)
            System.out.println(i + " - " + planeFigures[i]);

        // Accepting user input
        Scanner input = new Scanner(System.in);
        System.out.println(" ========================================\n");


        System.out.println("Please enter plane figure of your choice");
        int selection = input.nextInt();
        if(selection == 0){
            displayInstructionForCircle();
        } else if (selection == 1){
            displayInstructionForRectangle();
        }
        else if (selection == 2){
            displayInstructionForTriangle();

        }
        else if (selection == 3){
            displayInstructionForTrapezium();
        }
        else if(selection==4){
            displayInstructionForSquare();
        }
        else
        {
            System.out.println("Invalid input");

        }




    }

    public static double displayInstructionForCircle(){
        Scanner input = new Scanner(System.in);
        System.out.println("========================================\n");
        System.out.println("The formula for calculating area of a circle is pi*r*r");

        System.out.println("Please enter the radius of the circle, Pi is a constant value.");
        double rad = input.nextDouble();
        System.out.println("The area of the circle is :  " + calculateAreaOfCircle(rad)+ "centimeters square"  );
        // calling the calculation function
        double result = calculateAreaOfCircle(rad);
        return result;






    }
    public static double calculateAreaOfCircle(double radius){
        final  double PI = Math.PI;
        double area = PI * Math.pow(radius, 2);
        return area;

    }

    public static void displayInstructionForRectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("==================================\n");

        System.out.println("The formula for calculating the area of a Rectangle is l*b");


        //Accepting the lengths of the rectangle
        System.out.println("Please enter the lengths of the Rectangle");
        double lengths = input.nextDouble();


        // Accepting the breadth of the rectangle
        System.out.println("Enter the breadth of the rectangle");
        double breadth = input.nextDouble();
        System.out.println("The area of the Rectangle  is :  " + calculateAreaOfRectangle(breadth, lengths) + "centimeters square" );



    }
    public static double calculateAreaOfRectangle(double lengths, double breadths){
        double area = lengths * breadths;

        return area;

    }

    public static void displayInstructionForTriangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("==============================\n");
        System.out.println("The formula for calculating the area of the triangle is 1/2*b*h");
// prompting the user to enter the base of the triangle
        System.out.println(" Enter the base of the triangle");
        double b = input.nextDouble();

        System.out.println("Enter the height of the triangle");
        double h = input.nextDouble();
        System.out.println("The area of the triangle is " + calculateAreaOfTriangle( h,  b));
    }
    public static double calculateAreaOfTriangle( double h, double b){
         double area = 1/2 * b* h;
        return area;

    }
    public static void displayInstructionForTrapezium(){
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================\n");
        System.out.println("The formula for calculating the area of a trapezium is height*(base + length)/2");
        // Accepting the height of the trapezium
        System.out.println(" Enter the height:  ");
        double height = input.nextDouble();

        System.out.println("Enter the base :  ");
        double base = input.nextDouble();

        System.out.println("Enter length");
        double length = input.nextDouble();

        System.out.println("The area of the Trapezium is :" + calculateAreaOfTrapezium(base, height, length) + "centimeters square");
    }
    public static double calculateAreaOfTrapezium(double base, double height, double length){
        double area = height*(base + length)/2;
        return area;
    }

    public static void displayInstructionForSquare(){
        Scanner input = new Scanner(System.in);

        System.out.println("==================================\n");
        System.out.println("Area of a square is calculated with the formula length * length");


        System.out.println("Enter the length of the Square");
        double length1 = input.nextDouble();

        System.out.println("Enter another length");
        double length2 = input.nextDouble();

        System.out.println("The area of the square is " + calculateAreaOfSquare(length1, length2) +"centimeters square");
    }
    public static double calculateAreaOfSquare(double length1, double length2){
        double area = length1*length2;
        return area;

    }



    public static void main(String[] args) {
        displayMenu();
        System.out.println();



    }


    }






