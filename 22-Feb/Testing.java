import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.concurrent.ThreadLocalRandom;

public class Testing {

    public static void main(String[] args) {
        
        int testCases=300;
        System.out.println(testCases);
        for(int testCase=1;testCase<=testCases;testCase++){
        	//System.out.println("printing");
        	int min=3;
        	int max=200;
        	int n=ThreadLocalRandom.current().nextInt(min,max+1);
        	int k=ThreadLocalRandom.current().nextInt(1,n+1);
        	
        	System.out.println(n+" "+k);
        	
        	min=-1000;
        	max=1000;
        	int arr[]=new int[n];
        	arr[0]=ThreadLocalRandom.current().nextInt(min,0);
        	arr[1]=ThreadLocalRandom.current().nextInt(1,max);
        	arr[2]=0;
        	for(int i=3;i<n;i++)
        		arr[i]=ThreadLocalRandom.current().nextInt(min,max+1);
        	
        	for(int i=0;i<n;i++)
        		System.out.print(arr[i]+" ");
        	System.out.println();

        }

    }
}
