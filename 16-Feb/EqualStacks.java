import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualStacks  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        
        Stack<Integer> stack1=new Stack<Integer>();
        Stack<Integer> stack2=new Stack<Integer>();
        Stack<Integer> stack3=new Stack<Integer>();

        int max1=0,max2=0,max3=0;
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=scan.nextInt();
            max1+=arr[i];
        }

        for(int i=n1-1;i>=0;i--)
            stack1.push(arr[i]);

        arr=new int[n2];
        for(int i=0;i<n2;i++){
            arr[i]=scan.nextInt();
            max2+=arr[i];
        }

        for(int i=n2-1;i>=0;i--)
            stack2.push(arr[i]);

        arr=new int[n3];
        for(int i=0;i<n3;i++){
            arr[i]=scan.nextInt();
            max3+=arr[i];
        }

        for(int i=n3-1;i>=0;i--)
            stack3.push(arr[i]);

        // System.out.println(stack1);
        // System.out.println(stack2);
        // System.out.println(stack3);
        int max=findMax(stack1,stack2,stack3,max1,max2,max3);
        System.out.println(max);
    }

    static int findMax(Stack<Integer> stack1,Stack<Integer> stack2,Stack<Integer> stack3,int max1,int max2,int max3){
        boolean flag=false;
        while(!(max1==max2 && max1==max3)){
            //System.out.println("displaying max:"+max1+" "+max2+" "+max3);
            if(max1>max2 || max1>max3){
                int top=stack1.pop();
                max1=max1-top;
            }else if(max2>max1 || max2>max3){
                int top=stack2.pop();
                max2=max2-top;
            }else if(max3>max1 || max3>max2){
                int top=stack3.pop();
                max3=max3-top;
            }
            if(checkForEmpty(max1,max2,max3))
                return 0;
        }

        return max1;
    }

    static boolean checkForEmpty(int max1,int max2,int max3){
        if(max1==0|| max2==0 ||max3==0)
            return true;
        return false;
    }
}
