import java.util.*;

class LexicalAnalyzer {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        String[] lines=new String[N];
        for(int i=0;i<N;i++)
            lines[i]=scan.next();
        
        Set<String> variableNames=new HashSet<String>();
        
        for(int i=0;i<N;i++){
            String[] tokens=lines[i].split("");
            if(tokens[1].equals("=")
            variableNames.add(tokens[0]);
        }
        System.out.println(variableNames.size());

    }
}
