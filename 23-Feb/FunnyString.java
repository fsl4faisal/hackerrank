import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int T=scan.nextInt();

    	for(int testCase=0;testCase<T;testCase++){
    		String str=scan.next();

    		String rev=reverse(str);
    		int i=1;
    		int j=1;
    		while(i<str.length()){
    			int diff1=findDiff(str.charAt(i),str.charAt(i-1));
    			int diff2=findDiff(rev.charAt(i),rev.charAt(i-1));
    			if(diff1!=diff2)
    				break;
    			i++;
    			j++;
    		}
    		if(i==str.length())
    			System.out.println("Funny");
    		else
    			System.out.println("Not Funny");


    	}
    }
    private static String reverse(String str){
    	StringBuilder reverseString=new StringBuilder();
    	for(int i=str.length()-1;i>=0;i--)
    		reverseString.append(str.charAt(i));
    	return reverseString.toString();
    }
    private static int findDiff(char ch1,char ch2){
    	int diff=ch1-ch2;
    	if(diff<0)
    		return -diff;
    	return diff;
    }
}