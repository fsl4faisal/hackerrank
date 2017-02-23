import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);

    	int N=scan.nextInt();
    	for(int testCase=0;testCase<N;testCase++){
    		String str=scan.next();

    		Stack<Character> stack=new Stack<Character>();

    		for (int i=0; i<str.length(); i++) {
    			if(stack.isEmpty())
    				stack.push(str.charAt(i));
    			else if(stack.peek()!=str.charAt(i))
    				stack.push(str.charAt(i));
    		}
    		System.out.println(str.length()-stack.size());
    	}
    }
}