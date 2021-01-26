package HackerRank;

import java.util.Scanner;

public class Datatype_day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i1;
        double d1;
        String s1;

        /* Read and save an integer, double, and String to your variables.*/
       
         System.out.println("Enter input ");

i1=Integer.parseInt(scan.nextLine());
d1=Double.parseDouble(scan.nextLine());
s1=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        int sum=i+i1;
        System.out.println(sum);

        /* Print the sum of the double variables on a new line. */
		double dd=d+d1;
          System.out.println(dd);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */


s=s.concat(s1);
 System.out.println(s);

 scan.close();
    }
}





