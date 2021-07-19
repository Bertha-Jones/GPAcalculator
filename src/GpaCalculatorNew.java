import java.text.DecimalFormat;
import java.util.Scanner;

public class GpaCalculatorNew {
    public static void main(String[] args) {
        String letterGrade;
        double credit;
        double cal = 0;
        double totalCal = 0;
        double finalGpa  = 0;
        double totalCredit = 0;
               final double A = 4.0;
               final double BPLUS = 3.5;
               final double B = 3.0;
               final double CPLUS = 2.5;
               final double C = 2.0;
               final double DPLUS = 1.5;
               final double D = 1.0;
               final double E = 0.5;
               final double F= 0.0;
        DecimalFormat df = new DecimalFormat("0.##");
        Scanner grd = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Please enter the course code: ");
            int code = grd.nextInt();

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
            System.out.println("Please enter the course grade");
            letterGrade = grd.next();

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
            System.out.println("Please enter the course credit hour: ");
             credit = grd.nextDouble();

             switch (letterGrade){

                 case  "A": cal = credit *A;
                 case  "a" : cal = credit * A;
                 break;
                 case  "B+" : cal = credit * BPLUS;
                 case  "b+" : cal = credit *  BPLUS;
                 case "B" : cal = credit * B;
                 case "b" : cal = credit * B;
                 break;
                 case  "C+": cal = credit * CPLUS;
                 case  "c+" : cal = credit * CPLUS;
                 case "C" :cal = credit * C;
                 break;
                 case "D+" : cal = credit * DPLUS;
                 case "d+" : cal = credit * DPLUS;
                 case "D" : cal = credit * D;
                 case "d" : cal = credit * D;
                 break;
                 case  " E" : cal = credit * E;
                 case  "e" : cal = credit * E;
                 break;
                 case "F" : cal = credit * F;
                 break;


             }
             totalCredit = totalCredit + credit;

             totalCal = totalCal + cal;
        }
        finalGpa = totalCal /totalCredit;
        System.out.println("GPA: " + df.format(finalGpa));





    }


}
