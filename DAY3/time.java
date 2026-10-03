import java.util.*;
public class time {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        String s=so.next();
        int t=so.nextInt();
        int h=Integer.parseInt(s.substring(0,2));
        int m=Integer.parseInt(s.substring(3));
        
        int total = (h * 60 + m + t) % 1440;
        
        int nh = total / 60;
        int nm = total % 60;

        System.out.printf("%02d:%02d%n", nh, nm);
        so.close();
    }
}
