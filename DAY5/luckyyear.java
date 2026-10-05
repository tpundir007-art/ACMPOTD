import java.util.*;
public class luckyyear {
    public static void main(String[] args) {
        Scanner so = new Scanner (System.in);
        int year=so.nextInt();
        
        long p=1;
        
        while(year>=p*10)
        {
            p*=10;
        }
        long first=year/p;
        long lucky=(first+1)*p;
        System.out.println(lucky-year);
        so.close();
    }
}
