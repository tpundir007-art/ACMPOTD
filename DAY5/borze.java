import java.util.*;
public class borze{
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        String s=so.next();
        String z=".";
        String o="-.";
        String t="--";
        String ans="";
        int n=s.length();
        int i=0;
        int j=0;
        while(i<n && j<n)
        {
            j=i;
            String x=s.substring(i,j+1);
            if(x.equals(z))
            {
                i=j+1;
                ans=ans+"0";
            }
            else{
                j++;
                x=s.substring(i,j+1);
            }
            if(x.equals(o))
            {
                i=j+1;
                ans=ans+"1";
            }
            else if(x.equals(t))
            {
                i=j+1;
                ans=ans+"2";
            }
            
        }
        System.out.println(ans);
        so.close();
    }
}