import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] arr=new long[5];

        for(int i=0;i<5;i++)
        	arr[i]=scan.nextLong();

        int minIndex=findMinIndex(arr);
        int maxIndex=findMaxIndex(arr);

        long min=0;
        long max=0;
        for(int i=0;i<5;i++){
        	if(i!=minIndex)
        		max+=arr[i];
        	if(i!=maxIndex)
        		min+=arr[i];
        }
        System.out.println(min+" "+max);

    }

    public static int findMinIndex(long[] arr){
    	long min=Long.MAX_VALUE;
    	int minIndex=-1;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]<min){
    			min=arr[i];
    			minIndex=i;
    		}
    	}
    	return minIndex;
    }

    public static int findMaxIndex(long[] arr){
    	long max=Long.MIN_VALUE;
    	int maxIndex=-1;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]>max){
    			max=arr[i];
    			maxIndex=i;
    		}
    	}
    	return maxIndex;
    }
}
