import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int T=scan.nextInt();

		for(int testCase=0;testCase<T;testCase++){
			int A=scan.nextInt();
			int B=scan.nextInt();
    
            double counter=Math.floor(Math.pow(B,1.0/2.0))-Math.ceil(Math.pow(A,1.0/2.0))+1;
            
            System.out.println((int)counter);
		}

	}

}