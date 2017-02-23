

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int N=scan.nextInt();
		int M=scan.nextInt();

		long[] arr=new long[N+1];

		int[][] query=new int[M][3];

		for(int i=0;i<M;i++){
			query[i][0]=scan.nextInt();
			query[i][1]=scan.nextInt();
			query[i][2]=scan.nextInt();
		}

		
		for(int i=0;i<M;i++){
			int a=query[i][0];
			int b=query[i][1];
			int k=query[i][2];

			arr[a-1]+=k;
			arr[b]-=k;

			//display(arr);
		}

		long max=max(arr);

		System.out.println(max);

	}

	public static void display(long[] arr){
		System.out.println("arr:");
		for(long i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

	public static long max(long[] arr){
		long max=0;
		long totalSum=0;

		for(int i=0;i<arr.length;i++){
			totalSum+=arr[i];
			max=Math.max(totalSum,max);
		}

		return max;
	}
}