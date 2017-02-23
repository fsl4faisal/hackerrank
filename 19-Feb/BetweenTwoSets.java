

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i=0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int maxInA=Integer.MIN_VALUE;
		int minInB=Integer.MAX_VALUE;

		for(int i=0;i<n;i++){
			if(a[i]>maxInA)
				maxInA=a[i];
		}

		for(int i=0;i<m;i++){
			if(b[i]<minInB)
				minInB=b[i];
		}
		//System.out.println(maxInA+" "+minInB);
		int counter=0;
		for(int x=maxInA;x<=minInB;x++){
			int xi=0;
			int yi=0;
			for(;xi<a.length;xi++){
				if(x%a[xi]!=0)
					break;
			}
			if(xi==a.length){
				
				for(;yi<b.length;yi++){
					if(b[yi]%x!=0)
						break;
				}
			}
			if(yi==b.length){
				//System.out.println("{"+x+"}");
				counter++;
			}
		}
		System.out.println(counter);
	}
}
