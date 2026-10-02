//16 A FLAG Day 2
import java.util.*;

public class flag {
    public static void main(String[] args) {
      Scanner so=new Scanner(System.in);
      int n=so.nextInt();
      int m=so.nextInt();
      char[][] arr=new char[n][m];
      for(int i=0;i<n;i++)
      {
        String s=so.next();
        for(int j=0;j<m;j++)
        {
          arr[i][j]=s.charAt(j);
        }
      }
      boolean fl=true;//assuming a proper flag
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          if(arr[i][j]!=arr[i][0])
          {
            fl=false;
            break;
          }
        }
        if(i>0 && arr[i][0]==arr[i-1][0])
        {
          fl=false;
          break;
        }
      }

      System.out.println(fl?"YES":"NO");
      so.close();
    }
}
