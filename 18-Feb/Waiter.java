import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Waiter {

    public static void main(String[] args) {

    	Scanner scan=new Scanner(System.in);
    	int N=scan.nextInt();
    	int Q=scan.nextInt();

    	Stack<Integer>[] Ai=new Stack[Q+1];
    	Stack<Integer>[] Bi=new Stack[Q];
    	
    	Ai[0]=new Stack<Integer>();
    	
    	for(int i=0;i<N;i++){
    		int number=scan.nextInt();
    		Ai[0].push(number);
    	}

    	int[] primeNumbers=new int[1200];
    	getPrimeNumbers(primeNumbers);

    	for(int query=1;query<=Q;query++){
    		
    		Bi[query-1]=new Stack<Integer>();
    		Ai[query]=new Stack<Integer>();

    		while(!Ai[query-1].isEmpty()){
    			int numberPlate=Ai[query-1].pop();
    			if(numberPlate%primeNumbers[query-1]==0)
    				Bi[query-1].push(numberPlate);
    			else
    				Ai[query].push(numberPlate);
    		}
    	}
    	displayAnswer(Bi,Ai);
    	//display(primeNumbers);
    }

    public static void displayAnswer(Stack[] stack1,Stack[] stack2){
    	for(int i=0;i<stack1.length;i++){
    		while(!stack1[i].isEmpty()){
    		System.out.println(stack1[i].pop());
    		}	
    	}

    	for(int i=0;i<stack2.length;i++){
    		while(!stack2[i].isEmpty()){
    		System.out.println(stack2[i].pop());
    		}	
    	}
    }

    public static void display(int[] arr){
    	System.out.println("arr:");
    	for(int i:arr)
    		System.out.print(i+" ");
    	System.out.println();
    }

    public static void getPrimeNumbers(int[] primeNumbers){
    	primeNumbers[0]=2;
    	primeNumbers[1]=3;
    	int counter=2;
    	for(int i=4;counter<primeNumbers.length;i++){
    		int j;
    		for(j=2;j<i/2+1;j++){
    			if(i%j==0)
    				break;
    		}
    		if(j==i/2+1)
    			primeNumbers[counter++]=i;
    	}
    }
}