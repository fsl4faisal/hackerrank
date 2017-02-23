import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();

            long expensiveCost=0;
            long cheaperCost=0;
            long noOfCheaper=0;
            long noOfExpensives=0;
            long totalCost=0;

            if(x>y){
                expensiveCost=x;
                noOfExpensives=b;

                cheaperCost=y;
                noOfCheaper=w;
            }else if(y>x){
                expensiveCost=y;
                noOfExpensives=w;

                cheaperCost=x;
                noOfCheaper=b;
            }else{
                totalCost=(x*b)+(y*w);
                System.out.println(totalCost);
                continue;
            }

            if((cheaperCost+z)<expensiveCost){
                //System.out.println(expensiveCost+" "+noOfExpensives+"--"+cheaperCost+" "+noOfCheaper);
                long totalCheapCost=cheaperCost*noOfCheaper;
                long totalExpensiveCost=noOfExpensives*(cheaperCost+z);
                totalCost=totalExpensiveCost+totalCheapCost;
                System.out.println(totalCost);
                continue;
            }else{
                totalCost=(x*b)+(y*w);
                System.out.println(totalCost);
                continue;
                //totalCost=(expensiveCost*noOfExpensives)+(cheaperCost*noOfCheaper);
            }
        }
    }
}
