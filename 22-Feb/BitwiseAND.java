import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitwiseAND {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();

            int maxValue=0;
            for(int i=1;i<=n;i++){
            	for(int j=i+1;j<=n;j++){
            		int andValue=i&j;
            		if(andValue<k && andValue>maxValue)
            			maxValue=andValue;
            	}
            }

            System.out.println(maxValue);
        }
    }
}
