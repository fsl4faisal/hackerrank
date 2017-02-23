import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        str=str.toLowerCase();
        int[] alphabets=new int[26];
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)>='a' && str.charAt(i)<='z')
        		alphabets[str.charAt(i)-97]++;
        }
        // System.out.println(str);
        // for(int i:alphabets)
        // 	System.out.print(i+" ");
        //System.out.println();
        for(int i=0;i<alphabets.length;i++){
        	if(alphabets[i]==0){
        		System.out.println("not pangram");
        		return;
        	}
        }
        System.out.println("pangram");
    }
}