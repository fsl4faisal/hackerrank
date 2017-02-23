import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int T=scan.nextInt();

		for(int testcase=0;testcase<T;testcase++){
			long N=scan.nextLong();
			long M=scan.nextLong();
			long S=scan.nextLong();

			//int[] arr=new int[N+1];
			//long answer=((S+M)%N)-1;
			long answer;
			M=M%N;
			
			System.out.println((S+M-1));
			
			
			
			
		}

	}
	
}