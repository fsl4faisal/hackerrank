import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        // your code goes here
        if(year>=1700 && year<=1917){
        	boolean leapYear=checkJulianLeapYear(year);
			printProgrammerOfTheDay(year,leapYear);        	
        	return;
        }if(year>=1919 && year<=2700){
        	boolean leapYear=checkGregorianLeapYear(year);
        	printProgrammerOfTheDay(year,leapYear);        	
        	return;
        }if(year==1918){
        	System.out.println("27.09.1918");
        }

    }

    private static boolean checkGregorianLeapYear(int year){
    	if(year%400==0)
    		return true;
    	if(year%4==0 &&year%100!=0)
    		return true;
    	return false;
    }

    private static boolean checkJulianLeapYear(int year){
    	if(year%4==0)
    		return true;
    	return false;
    }

    private static void printProgrammerOfTheDay(int year,boolean leapYear){
    	if(leapYear)
        		System.out.println("12.09."+year);
        	else
        		System.out.println("13.09."+year);
    }
}
