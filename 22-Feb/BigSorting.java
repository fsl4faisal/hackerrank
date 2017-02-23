import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        BigInteger[] unSortedBigIntegers=new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
            unSortedBigIntegers[unsorted_i]=new BigInteger(unsorted[unsorted_i]);
        }

       	Arrays.sort(unSortedBigIntegers);
       	//System.out.println("output:");
       	printNumbers(unSortedBigIntegers);
        // your code goes here
    }

    private static void printNumbers(BigInteger[] numbers){
    	for(int i=0;i<numbers.length;i++){
    		System.out.println(numbers[i].toString());
    	}
    }


}
