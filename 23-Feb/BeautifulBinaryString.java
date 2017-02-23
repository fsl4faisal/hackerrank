import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();

        Stack<Character> stack=new Stack<Character>();
        int pattern=0;
        int operation=0;
        for(int i=0;i<B.length();i++){
        	if(stack.isEmpty() && B.charAt(i)=='0'){
        		stack.push(B.charAt(i));
        		pattern++;
        	}
        	else if(stack.isEmpty() && B.charAt(i)=='1'){
        		stack.push(B.charAt(i));
        	}else if(stack.peek()=='0' && B.charAt(i)=='1'){
        		stack.push(B.charAt(i));
        		pattern++;
        	}else if(stack.peek()=='1' && B.charAt(i)=='0' && pattern==2){
        		stack.push('1');
        		pattern=0;
        		operation++;
        	}else if(B.charAt(i)=='1'){
        		stack.push(B.charAt(i));
        		pattern=0;
        	}else if(B.charAt(i)=='0'){
        		stack.push(B.charAt(i));
        		pattern=1;
        	}
        }
        // char[] beautifulBinaryString=new char[stack.size()];
        // int k=stack.size()-1;
        // while(!stack.isEmpty())
        // 	beautifulBinaryString[k--]=stack.pop();
        // for(char ch:beautifulBinaryString)
        // 	System.out.print(ch);
        // System.out.println();
        System.out.println(operation);
    }
}
