import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);

        int Q=scan.nextInt();

        Stack<Integer> inStack=new Stack<Integer>();
        Stack<Integer> outStack=new Stack<Integer>();

        for(int query=0;query<Q;query++){
        	int type=scan.nextInt();
        	if(type==1){
        		int x=scan.nextInt();
        		enqueue(inStack,x);
        	}else if(type==2){
        		dequeue(inStack,outStack);
        	}else{
        		System.out.println(peek(inStack,outStack));
        	}
        }
    }
    public static void enqueue(Stack<Integer> inStack,int x){
    	inStack.push(x);
    }
    public static int peek(Stack<Integer> inStack,Stack<Integer> outStack){
    	if(outStack.isEmpty()){
    		while(!inStack.isEmpty())
    			outStack.push(inStack.pop());
    		return outStack.peek();
    	}else{
    		return outStack.peek();
    	}
    }

    public static int dequeue(Stack<Integer> inStack,Stack<Integer> outStack){
    	if(outStack.isEmpty()){
    		while(!inStack.isEmpty())
    			outStack.push(inStack.pop());
    		int x=outStack.pop();
    		return x;
    	}else{
    		return outStack.pop();
    	}
    }
}