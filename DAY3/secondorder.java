import java.util.*;
public class secondorder {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=so.nextInt();
        }
        //SORT AND FIND THE SECOND DISTINCT ELEMENT.
        Arrays.sort(arr);
        int m1=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[0])
            {
                m1=arr[i];
                break;
            }
        }
        System.out.println(m1==Integer.MAX_VALUE?"NO":m1);
        so.close();
    }
}
