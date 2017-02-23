import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        String cipherText="";

        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        		int cipherChar=((s.charAt(i)-'a')+k)%26+'a';
        		cipherText+=Character.toString((char)cipherChar);
        	}else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
        		int cipherChar=((s.charAt(i)-'A')+k)%26+'A';
        		cipherText+=Character.toString((char)cipherChar);
        	}else{
        		cipherText+=s.charAt(i);
        	}
        }
        System.out.println(cipherText);

    }
}
