///DAY 1 -INTERMEDIATE 598 A
import java.util.*;
public class trickysum {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();
        while(t-->0)
        {
            long n=so.nextLong();
            long sum=n*(n+1)/2;
            long sum2=0;
            for(int i=1;i<=n;i*=2)
            {
                sum2+=i;
            }
            System.out.println(sum-(2*sum2));
        }
        so.close();
    }
}
