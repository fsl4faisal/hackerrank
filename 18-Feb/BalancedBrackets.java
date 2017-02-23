import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] str=new String[T];

		for(int i=0;i<T;i++)
			str[i]=scan.next();

		for(int testcase=0;testcase<T;testcase++){
			checkString(str[testcase]);
		}

	}

	public static void checkString(String str){
		Stack<Character> stack=new Stack<Character>();
			boolean flag=true;
			INNER_FOR:
			for(int i=0;i<str.length();i++){
				char currentChar=str.charAt(i);
				
				switch(currentChar){
					case '[':
					stack.push('[');
					break;
					case '{':
					stack.push('{');
					break;
					case '(':
					stack.push('(');
					break;
					case '}':
					if (!stack.isEmpty() && stack.peek()=='{') 	
						stack.pop();
					else{
						//System.out.println("something fishy at:"+str+" "+currentChar);
						flag=false;
					}
					break;
					case ']':
					if(!stack.isEmpty() && stack.peek()=='[')
						stack.pop();
					else{
						//System.out.println("something fishy at:"+str+" "+currentChar);
						flag=false;
					}
					break;
					case ')':
					if(!stack.isEmpty() && stack.peek()=='(')
						stack.pop();
					else{
						//System.out.println("something fishy at:"+str+" "+currentChar);
						flag=false;
					}
					break;
					default:
					if(flag==false)
						break INNER_FOR;
				}
			//check if empty in the middle if yes then print no	
				// if(stack.isEmpty() && i<str[testcase].length()-1){
				// 	emptyInBetween=true;
				// 	break;
				// }
				
					if(flag==false)
						break;
			}
			if(flag==true && stack.isEmpty())
				System.out.println("YES");
			else
				System.out.println("NO");
	}
}
