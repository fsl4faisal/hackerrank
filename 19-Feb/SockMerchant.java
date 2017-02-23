import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int count=countSockPairs(map,c);
        System.out.println(count);
    }

    public static int countSockPairs(HashMap<Integer,Integer> map,int[] c){
    	for(int i=0;i<c.length;i++){
    		if(map.containsKey(c[i])){
    			int count=map.get(c[i]);
    			map.put(c[i],++count);
    		}else{
    			map.put(c[i],1);
    		}
    	}

    	int counter=0;
    	for(int color:map.keySet()){
    		counter+=map.get(color)/2;
    	}
    	return counter;
    }
}
