import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        int D=scan.nextInt();

        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        	arr[i]=scan.nextInt();

        D=D%N;

       int[] newArr=new int[N];
       int counter=0;
       for(int i=D;counter<N;){
       		newArr[counter++]=arr[i];
       		i=plusOne(i,N);
       }

       for(int i:newArr)
       	System.out.print(i+" ");

    }

	public static int plusOne(int index,int N){
		if(index+1==N)
			return 0;
		return index+1;
	}
}