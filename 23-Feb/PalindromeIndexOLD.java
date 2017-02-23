import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndexOLD {
    
    	public static boolean checkPalindrome(String str){
		
		boolean flag=false;
		int i=0,j=str.length()-1;
		
		for(;i<str.length();i++,j--){
			if(str.charAt(i)!=str.charAt(j))
				return flag;
		}
		flag=true;
		return flag;
	}

    public static void main(String args[]) throws IOException{

		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	
	
		int testCases=Integer.parseInt(buffer.readLine());
		String str[]=new String[20];
		for(int i=0;i<testCases;i++)
			str[i]=buffer.readLine();
	
		for(int i=0;i<testCases;i++){

			String currentString=str[i];
			
			if(checkPalindrome(currentString)){
				System.out.println(-1);
					continue;
			}
			for(int j=0;j<currentString.length();j++){
				if(checkPalindrome(currentString.substring(0,j).concat(currentString.substring(j+1,currentString.length())))){
					System.out.println(j);
					break;
				}
				
			}

		}
	


	}
}
