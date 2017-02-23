import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int G = scan.nextInt();

        for(int game = 0; game < G; game++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = scan.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = scan.nextInt();
            }


            Stack<Integer> A=new Stack<Integer>();
            Stack<Integer> B=new Stack<Integer>();
            for(int i=a.length-1;i>=0;i--)
                A.push(a[i]);
            for(int i=b.length-1;i>=0;i--)
                B.push(b[i]);

            long runningSum=0;
            long score=0;
            int min;
            while(true){
                if(checkIfStacksAreEmpty(A,B))
                    break;
                min=getMinFromStacks(A,B);
                runningSum+=min;
                if(runningSum>x)
                    break;
                ++score;
                // if(runningSum<=x)
                //     score++;
                // else
                //     break;
                
                System.out.println("runningSum:"+runningSum+" x:"+x+" score:"+score);
            }

            System.out.println(score);
            // your code goes here
        }
    }
    public static int getMinFromStacks(Stack<Integer> A,Stack<Integer> B){
        int numA=Integer.MAX_VALUE;
        int numB=Integer.MAX_VALUE;
        if(!A.isEmpty()){
            numA=A.peek();
        }
        if(!B.isEmpty()){
            numB=B.peek();
        }
        if(numA<=numB)
            return A.pop();
        else
            return B.pop();

    }
    public static boolean checkIfStacksAreEmpty(Stack<Integer> A,Stack<Integer> B){
        if(A.isEmpty() && B.isEmpty())
            return true;
        return false;
    }
}
