import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        int[] arr=new int[N];

        HashMap<Integer,Integer> freqCount=new HashMap<Integer,Integer>();
        int maxFrequency=1;
        for(int i=0;i<N;i++){
        	arr[i]=scan.nextInt();
        	int count=0;
        	if(freqCount.containsKey(arr[i])){
        		count=freqCount.get(arr[i]);
        		freqCount.put(arr[i],++count);
        		if(count>maxFrequency)
        			maxFrequency=count;
        	}
        	else
        		freqCount.put(arr[i],1);
        }
        int total=0;
        //System.out.println(freqCount);
        for(int i:freqCount.keySet())
        	total+=freqCount.get(i);
        //System.out.println(total);
        //System.out.println(maxFrequency);
        System.out.println((total-maxFrequency));

    }
}