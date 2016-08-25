package fractions;

import java.util.Scanner;

/*
 * @author george oster
 */

public class Fractions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int again = 2;
        int num;
        int den;
        int gcd;

        System.out.println("this program gives the reduced form of a fraction.");
        while (again == 2){
            System.out.print("\nenter numerator: ");
            num = scan.nextInt();
            System.out.print("\nenter denominator: ");
            den = scan.nextInt();

            gcd = findGCD(num, den);
            while (gcd != 1) {
                num = num / gcd;
                den = den / gcd;
                gcd = findGCD(num, den);
            }

            System.out.println("\nreduced form is: " + num + " / " + den);
            System.out.print("\nwould you like to enter another fraction?\nenter 1 to exit. enter 2 to go again:  ");
            again = scan.nextInt();
            
        }//close while (again == 2)
        
    }//close main()

    public static int findGCD(int n, int d) {

        int toreturn = 1;
        int i;
        int loopto;

        //determine if numerator or denominator is larger and set loopto accordingly
        if (n > d) 
            loopto = n;
        else 
            loopto = d;
        
        //find the greatest common divisor
        for (i = 2; i < loopto; i++) {
            if (d % i == 0) 
                if (n % i == 0) 
                    toreturn = i;
        }

        return toreturn;
        
    }//close findGCD()
    
}//close Fractions
