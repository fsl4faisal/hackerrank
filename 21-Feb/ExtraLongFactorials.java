import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger factOfNumber=calculateFactorial(n);
        System.out.println(factOfNumber);
    }

    private static BigInteger calculateFactorial(int number){
    	BigInteger factOfNumber=BigInteger.ONE;
    	for(BigInteger i=BigInteger.ONE;i.compareTo(BigInteger.valueOf(number))<=0;i=i.add(BigInteger.ONE)){
    		//System.out.println("compareTo value:"+i.compareTo(BigInteger.valueOf(number)));
    		//System.out.println(factOfNumber);
    		factOfNumber=factOfNumber.multiply(i);
    	}

    	return factOfNumber;
    }
}
