import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPCTeam {

	public static class Team{
		String teamTopic;
		int noOfOnes;

		public Team(String teamTopic,int noOfOnes){
			this.teamTopic=teamTopic;
			this.noOfOnes=noOfOnes;
		}

		@Override
		public String toString(){
			
			return "("+teamTopic+","+noOfOnes+")";
		}

		@Override
		public boolean equals(Object o){
			Team other=(Team)o;
			if(this.teamTopic.equals(other.teamTopic) && this.noOfOnes==other.noOfOnes)
				return true;
			return false;
		}

		@Override
		public int hashCode(){
			return teamTopic.hashCode()+noOfOnes;
		}
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        HashMap<Team,Integer> teams=new HashMap<Team,Integer>();

        int maximumNumberOfOnes=0;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		String currentTeam=OROperation(topic[i],topic[j]);
        		int noOfOnes=countOnes(currentTeam);
        		if(noOfOnes>maximumNumberOfOnes)
        			maximumNumberOfOnes=noOfOnes;
        		Team team=new Team(currentTeam,noOfOnes);
        		if(teams.containsKey(team)){
        			int counter=teams.get(team);
        			teams.put(team,++counter);	
        		}else
        			teams.put(team,1);
        	}
        }
        //System.out.println(teams);

        int maximumNumberOfTeamsWithMaximumNumberOfOnes=0;
        for(Team t:teams.keySet()){
        	if(t.noOfOnes==maximumNumberOfOnes)
        		maximumNumberOfTeamsWithMaximumNumberOfOnes+=teams.get(t);
        }
        System.out.println(maximumNumberOfOnes);
        System.out.println(maximumNumberOfTeamsWithMaximumNumberOfOnes);
    }

    public static String OROperation(String str1,String str2){
    	StringBuilder answer=new StringBuilder();

    	for(int i=0;i<str1.length();i++){
    		if(str1.charAt(i)=='1' || str2.charAt(i)=='1')
    			answer.append("1");
    		else
    			answer.append("0");
    	}
    	return answer.toString();
    }

    public static int countOnes(String str){
    	int counter=0;
    	for(int i=0;i<str.length();i++)
    		if(str.charAt(i)=='1')
    			counter++;

    	return counter;
    }
}
