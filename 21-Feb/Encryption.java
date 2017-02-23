import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();

		//System.out.println("entred String is:"+str);
		String[] words=str.split(" ");
		int L=0;
        //System.out.println(words);
		StringBuilder sentenceWithoutSpace=new StringBuilder();
		for(String word:words){
			sentenceWithoutSpace.append(word);
			L+=word.length();
		}

		//System.out.println(sentenceWithoutSpace);
		int rows=(int)Math.floor(Math.pow(L,1.0/2.0));
		int cols=(int)Math.ceil(Math.pow(L,1.0/2.0));

        //System.out.println(rows+" "+cols);
        if((rows*cols)<L){
        	if(rows<cols)
        		rows++;
        	else
        		cols++;
        }

		int counter=0;
		char[][] arr=new char[rows][cols];

		for(int i=0;i<rows;i++){
			for (int j=0; j<cols; j++) {
				arr[i][j]=' ';
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				try{
					arr[i][j]=sentenceWithoutSpace.charAt(counter);
					counter++;
				}catch(IndexOutOfBoundsException e){
					break;
				}
			}
		}

		counter=0;
		for(int i=0;i<cols;i++){
			int j=0;
			for(;j<rows;j++){
				counter++;
				System.out.print(arr[j][i]);
			}
			if(counter==(rows*cols))
				break;
			if(arr[j-1][i]!=' ')
				System.out.print(" ");
		}


	}
}
