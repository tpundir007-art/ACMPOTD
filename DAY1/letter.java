//DAY 1- 1ST OCT PROBLEM 14A
import java.util.*;
public class letter
{
    //what i understand is that we need to find the maximum shades blocks in one row and column

    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int m=so.nextInt();
       
        char arr[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            String s=so.next();
            for(int j=0;j<m;j++)
            {
                arr[i][j]= s.charAt(j);
            }
        }
        int max1=-1;
        int min1=n;
        int max2=-1;
        int min2=m;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]=='*')
                {
                    max1=Math.max(max1,i);
                    min1=Math.min(min1,i);
                    max2=Math.max(max2,j);
                    min2=Math.min(min2,j);
                }
            }
        }
        for(int i=min1;i<=max1;i++)
        {
            for(int j=min2;j<=max2;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        so.close();
    }
}
