import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheLoveLetterMystery {

    public static void main(String[] args) {

    	Scanner scan=new Scanner(System.in);
    	int T=scan.nextInt();

    	for(int testCase=0;testCase<T;testCase++){
    		String str=scan.next();
    		int length=str.length();
    		String leftSubString=str.substring(0,length/2);
    		String rightSubString="";
    		if(length%2==0)
    			rightSubString=str.substring(length/2,length);
    		else
    			rightSubString=str.substring((length/2)+1,length);
    		//System.out.println("the split:"+leftSubString+" "+rightSubString);
    		rightSubString=reverse(rightSubString);
    		//System.out.println("the split:"+leftSubString+" "+rightSubString);
    		System.out.println(difference(leftSubString,rightSubString));
    	}
    }
    private static String reverse(String str){
    	StringBuilder rev=new StringBuilder();
    	for(int i=str.length()-1;i>=0;i--)
    		rev.append(str.charAt(i));
    	return rev.toString();
    }

    private static int difference(String leftSubString,String rightSubString){
    	int diff=0;
    	for(int i=0;i<leftSubString.length();i++){
    		int currentDiff=leftSubString.charAt(i)-rightSubString.charAt(i);
    		if(currentDiff<0)
    			diff=diff-currentDiff;
    		else
    			diff+=currentDiff;
    	}
    	return diff;
    }
}