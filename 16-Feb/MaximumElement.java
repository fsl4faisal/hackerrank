import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner (System.in);
        int N=scan.nextInt();
        Stack<Integer> stack=new Stack<Integer>();
        Stack<Integer> max=new Stack<Integer>();
        int i=0;
        while(i<N){
            int type=scan.nextInt();
            if(type==1){
                int x=scan.nextInt();
                stack.push(x);
                pushInMax(max,x);
            }else if(type==2){
                int x=stack.pop();
                deleteFromMax(max,x);
            }else if(type==3){
                System.out.println(max.peek());
            }
            i++;
        }
    }
    static void pushInMax(Stack<Integer> max,int x){
        if(max.isEmpty()||x>=max.peek()){
            max.push(x);
            return;
        }
    }
    
    static void deleteFromMax(Stack<Integer> max,int x){
        if(max.peek()==x)
            max.pop();
    }
}