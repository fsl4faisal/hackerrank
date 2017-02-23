import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();

        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        	arr[i]=scan.nextInt();

        int max=arr[0];
        int min=arr[0];
        int maxCounter=0;
        int minCounter=0;

        for(int i=1;i<N;i++){
        	if(arr[i]>max){
        		max=arr[i];
        		maxCounter++;
        	}
        	if(arr[i]<min){
        		min=arr[i];
        		minCounter++;
        	}
        }
        System.out.println(maxCounter+" "+minCounter);
    }
}
