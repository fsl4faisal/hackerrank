import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
 		Scanner scan=new Scanner(System.in);

 		int N=scan.nextInt();
 		String[] strings=new String[N];

 		for(int i=0;i<N;i++)
 			strings[i]=scan.next();
 		
 		int Q=scan.nextInt();

 		String[] queryStrings=new String[Q];
 		for(int query=0;query<Q;query++)
 			queryStrings[query]=scan.next();

 		for(int i=0;i<Q;i++){
 			int counter=0;
 			for(int j=0;j<N;j++){
 				if(queryStrings[i].equals(strings[j]))
 					counter++;
 			}
 			System.out.println(counter);
 		}

 		
    }
}