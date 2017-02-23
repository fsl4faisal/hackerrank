import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();

		Stack<Character> stack=new Stack<Character>();

		int i=0;
		while(i<str.length()){

			if(!stack.isEmpty() && stack.peek()==str.charAt(i))
				stack.pop();
			else
				stack.push(str.charAt(i));
			i++;
		}
		if(stack.isEmpty()){
			System.out.println("Empty String");
		}else{
			String answer="";
			while(!stack.isEmpty()){
				answer+=stack.pop();
			}
			i=answer.length()-1;
			for(;i>=0;i--)
				System.out.print(answer.charAt(i));
		}

	}


}