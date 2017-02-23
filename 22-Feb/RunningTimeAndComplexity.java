import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int T=scan.nextInt();

    	for(int testcase=0;testcase<T;testcase++){
    		int number=scan.nextInt();
    		if(checkPrime(number))
    			System.out.println("Prime");
    		else
    			System.out.println("Not prime");
    	}

    }

    private static boolean checkPrime(int number){
    	if(number==1)
    		return false;
    	for(int i=2;i<=number/2;i++)
    		if(number%i==0)
    			return false;

    	return true;
    }
}
