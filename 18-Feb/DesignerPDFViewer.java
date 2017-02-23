import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr=new int[26];

        for(int i=0;i<26;i++)
        	arr[i]=scan.nextInt();

        String str=scan.next();

        Set<Character> uniqueChars=new HashSet<Character>();


        int i=0;
        while(i<str.length()){
        	uniqueChars.add(str.charAt(i));
        	i++;
        }
        int maxHeight=getMaxHeight(uniqueChars,arr);

        System.out.println(maxHeight*str.length());
    }

    public static int getMaxHeight(Set<Character> set,int[] arr){
    	int maxHeight=0;
    	for(char ch:set){
    		if(arr[ch-97]>maxHeight)
    			maxHeight=arr[ch-97];
    	}
    	return maxHeight;
    }
}
