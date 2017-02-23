import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();

		

		HashSet<Character> set=new HashSet<Character>();

		int i=0;
		while(i<s.length()){
			set.add(s.charAt(i));
			i++;
		}
		char[] distinctChars=new char[set.size()];

		i=0;
		for(char ch:set)
			distinctChars[i++]=ch;

		i=0;
		int maxLength=0;
		System.out.println(set);

		for(;i<distinctChars.length;i++){
			for(int j=i+1;j<distinctChars.length;j++){
				int length=getLength(s,s.charAt(i),s.charAt(j));
				if(length>maxLength)
					maxLength=length;
			}
		}
		System.out.println(maxLength);
	}

	private static int getLength(String s,char ch1,char ch2){
		Stack<Character> stack=new Stack<Character>();
		int i=0;
		while(i<s.length()){
			if(s.charAt(i)==ch1 || s.charAt(i)==ch2){
				if(stack.isEmpty())
					stack.push(s.charAt(i));
				else if(stack.peek()!=s.charAt(i))
					stack.push(s.charAt(i));
				else
					break;
			}
			i++;
		}
		//System.out.println(ch1+" "+ch2);
		System.out.println(stack+"-->"+stack.size());

		if(i==s.length())
			return stack.size();
		else
			return stack.size();
	}
}
