import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {

    public static void main(String[] args) {

    	Scanner scan=new Scanner(System.in);
    	int N=scan.nextInt();
    	int Q=scan.nextInt();

    	int lastAns=0;
    	ArrayList[] seqList=new ArrayList[N];
    	for(int i=0;i<N;i++)
    		seqList[i]=new ArrayList<Integer>();

    	for(int query=0;query<Q;query++){
    		int type=scan.nextInt();
    		int X=scan.nextInt();
    		int Y=scan.nextInt();
    		int index=((X^lastAns)%N);
    		// System.out.println("index:"+index);
    		// System.out.println("lastAns:"+lastAns);
    		if(type==1){
    			seqList[index].add(Y);
    		}else{
    			int newIndex=Y%(seqList[index].size());
    			lastAns=(Integer)seqList[index].get(newIndex);
    			System.out.println(lastAns);
    		}
    		// for(int i=0;i<N;i++)
    		// 	System.out.println(seqList[i]);
    	}

    }
}