import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int counter=findDigits(n);
            System.out.println(counter);
        }
    }
    public static int findDigits(int number){
    	int temp=number;

    	int counter=0;
    	while(temp!=0){
    		int digit=temp%10;
    		if(digit!=0){
    			if(number%digit==0)
    				counter++;
    		}
    		temp=temp/10;
    	}
    	return counter;
    }
}
