import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        int yearDiff=y1-y2;
        int monthDiff=m1-m2;
        int dayDiff=d1-d2;

        if(yearDiff<0){
        	System.out.println("0");
        	return;
        }
        if(yearDiff>0){
        	System.out.println("10000");
        	return;
        }if(monthDiff<0){
        	System.out.println("0");
        	return;
        }
        if(monthDiff>0){
        	System.out.println((500*monthDiff));
        	return;
        }else if(dayDiff>0){
        	System.out.println((15*dayDiff));
        	return;
        }else
        System.out.println("0");
    }
}
