import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);

    	int N=scan.nextInt();
    	int kthIndex=scan.nextInt();

    	int[] cost=new int[N];
    	int totalCost=0;
    	for(int i=0;i<N;i++){
    		cost[i]=scan.nextInt();
    		totalCost+=cost[i];
    	}
    	int billCharged=scan.nextInt();
    	int totalCostMinusKthItem=totalCost-cost[kthIndex];

    	int actualBill=totalCostMinusKthItem/2;
    	if(actualBill==billCharged)
    		System.out.println("Bon Appetit");
    	else
    		System.out.println((billCharged-actualBill));


    }
}