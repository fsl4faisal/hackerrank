import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntroToDatabases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list=new ArrayList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(emailID.endsWith("@gmail.com"))
            	list.add(firstName);
        }
        Collections.sort(list);

        for(String str:list)
        	System.out.println(str);
    }
}
