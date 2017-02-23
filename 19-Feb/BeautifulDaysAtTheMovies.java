

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int low=scan.nextInt();
        int high=scan.nextInt();
        int k=scan.nextInt();

        int counter=0;
        for(int i=low;i<=high;i++){
        	int revI=reverse(i);
        	int diff=i-revI;
        	if(diff%k==0)
        		counter++;
        }
        System.out.println(counter);
    }

    public static int reverse(int number){
    	String newNumber="";
    	String numberStr=Integer.toString(number);

    	for(int i=numberStr.length()-1;i>=0;i--)
    		newNumber+=Character.toString(numberStr.charAt(i));
    	return Integer.valueOf(newNumber);
    }
}