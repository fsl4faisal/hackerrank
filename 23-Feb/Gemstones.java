import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones  {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int N=scan.nextInt();

       HashSet<Character>[] uniqueElements=new HashSet[N];

       for(int i=0;i<N;i++){
       	String rock=scan.next();
       	uniqueElements[i]=new HashSet<Character>();
       	for(int j=0;j<rock.length();j++)
       		uniqueElements[i].add(rock.charAt(j));
       }
       int[] elements=new int[26];
       for(int i=0;i<N;i++){
       	for(char ch:uniqueElements[i])
       		elements[ch-'a']++;
       }
       int gemElements=0;
       for(int counter:elements){
       	if(counter==N)
       		gemElements++;
       }
       System.out.println(gemElements);
    }
}