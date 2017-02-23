import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();

		for(int testCase=0;testCase<T;testCase++){
			String str=scan.next();
    		//System.out.println(checkPalindrome(str));
			if(checkPalindrome(str)){
				System.out.println("-1");
			}else{
				System.out.println(makePalindrome(str));

			}
		}

	}

	private static boolean checkPalindrome(String str){
		if(str.length()%2==0)
			return checkPalindromeEven(str);
		else 
			return checkPalindromeOdd(str);
	}
	private static boolean checkPalindromeEven(String str){
		int i=0;
		int j=str.length()-1;
		while(i<=str.length()/2){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	private static boolean checkPalindromeOdd(String str){
		int i=0;
		int j=str.length()-1;
		while(i<=(str.length()/2)-1){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	private static int makePalindrome(String str){
		StringBuilder newString;
		int index=0;
		boolean flag=false;
		while(index<str.length()){
			newString=new StringBuilder();
			for(int i=0;i<str.length();i++){
				if(i!=index)
					newString.append(str.charAt(i));
			}
			flag=checkPalindrome(newString.toString());
			if(flag)
				break;
			index++;
		}
		if(flag)
			return index;
		else
			return -1;

	}
}
