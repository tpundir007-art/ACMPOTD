import java.util.*;
public class wetshark {
    public static void main(String[] args) {
        {
            Scanner so=new Scanner(System.in);
            int n=so.nextInt();
            long sum=0;
            long[] arr=new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=so.nextInt();
            }
            if(n==1 && arr[0]%2!=0)
            {
                System.out.println(0);
                System.exit(0);
            }
            long minodd=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
                if(arr[i]%2!=0)
                minodd=Math.min(minodd,arr[i]);
            }
            if(sum%2!=0)
                sum-=minodd;
            System.out.println(sum);
            so.close();
        }
    }
}
