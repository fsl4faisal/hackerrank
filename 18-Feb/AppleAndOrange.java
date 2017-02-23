import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int countApple=0;

        for(int i=0;i<apple.length;i++){
            int xAxis=a+apple[i];
            if(xAxis>=s && xAxis<=t)
                countApple++;
        }

        int countOrange=0;

        for(int i=0;i<orange.length;i++){
            int xAxis=b+orange[i];
            if(xAxis>=s && xAxis<=t)
                countOrange++;
        }
        System.out.println(countApple+"\n"+countOrange);
    }
}
