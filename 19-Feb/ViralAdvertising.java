import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);

    	int n=scan.nextInt();

    	long noOfPeopleLiked=0;
    	long noOfAdvSent=5;
    	long totalNoOfPeopleWhoLikedTheAdv=0;
    	for(int i=1;i<=n;i++){
    		noOfPeopleLiked=noOfAdvSent/2;
    		noOfAdvSent=noOfPeopleLiked*3;
    		totalNoOfPeopleWhoLikedTheAdv+=noOfPeopleLiked;
    	}
    	System.out.println(totalNoOfPeopleWhoLikedTheAdv);
    }
}