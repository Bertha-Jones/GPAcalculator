import java.text.DecimalFormat;
import java.util.Scanner;

public class GpaCalculator {


    public static double finalgpa(double totalcal, double totalcredit){
        double finalgpa = totalcal/totalcredit;
        return finalgpa;
    }


    public static void main(String[] args) {
        // Declaring variables
        String letterGrade = "";
        double credit = 0;
        double caltimes = 0;
        double totalcal = 0;
        double totalcredit = 0;
        double finalgpa = 0;


        // Using final to create some  difference from the double
        double A = 4.0;
         double BPLUS = 3.5;
         double B = 3.0;
        double CPLUS = 2.5;
         double C = 2.0;
         double DPLUS = 1.5;
         double D = 1.0;
         double E = 0.5;
         double F = 0.0;
        DecimalFormat df = new DecimalFormat("0.##");

          Scanner input = new Scanner(System.in);
        System.out.println("***************************************\n");
          for(int i = 0; i<=7; i++) {


              System.out.println("Please enter your course code : ");
              int code = input.nextInt();
              System.out.println("***************************************\n");



              System.out.println(" Please enter your course grade letter: ");
              String grade = input.next();


              System.out.println("Please enter your credit hour:  ");
              double creditHour = input.nextDouble();


              switch (letterGrade){
                  case "A" : caltimes = credit*A;
                  break;
                  case "B+" : caltimes = credit* BPLUS;
                  break;
                  case "B"  : caltimes =  credit* B;
                  break;
                  case "C+" : caltimes = credit* CPLUS;
                  break;
                  case "C" : caltimes = credit* C;
                  break;
                  case "D+" : caltimes = credit* DPLUS;
                  break;
                  case "D" : caltimes  = credit* D;
                  break;
                  case "E" : caltimes = credit* E;
                  break;
                  case "F" : caltimes = credit* F;
                  break;


              }

          }



        System.out.println("GPA: " + df.format(finalgpa));




    }
}
