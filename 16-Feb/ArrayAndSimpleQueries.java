import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ArrayAndSimpleQueries{

	public static void main(String[] args)  throws Exception{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

		String line=buffer.readLine();
		String[] words=line.split(" ");
		int N=Integer.parseInt(words[0]);
		int M=Integer.parseInt(words[1]);

		line=buffer.readLine();
		words=line.split(" ");

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(int i=0;i<N;i++)
			list.add(Integer.parseInt(words[i]));

		int[][] queries=new int[M][3];

		for(int i=0;i<M;i++){
			line=buffer.readLine();
			words=line.split(" ");
			queries[i][0]=Integer.parseInt(words[0]);
			queries[i][1]=Integer.parseInt(words[1]);
			queries[i][2]=Integer.parseInt(words[2]);
		}

		for(int query=0;query<M;query++){
			int type=queries[query][0];
			int i=queries[query][1];
			int j=queries[query][2];

			if(type==1){
				int counter=0;
				int front=list.get(0);
				list.remove(0);
				list.add(j-i+1,front);
			}else{
				for(int index=i-1;index<j;index++){
					Integer temp=list.get(index);
					list.remove(temp);
					list.add(temp);
				}
			}
			display(list);
		}

		

	}

	public static void display(ArrayList<Integer> list){
		for(int i:list)
			System.out.print(i+" ");
		System.out.println();
	}
}