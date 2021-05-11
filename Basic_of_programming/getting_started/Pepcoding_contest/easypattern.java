package Pepcoding_contest;

import java.util.*;

public class easypattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(count + " ");
                count++;
            }
            
            if(n%2 == 1)
            {
              if(i<=n/2)
              {
                  count+=n;
              }
              else if(i==n/2+1)
              {
                  count-=(n+n);
              }
              else{
                  count-=(n+n+n);
              }
            }
            else
            {
                if(i<n/2)
                {
                    count+=n;
                    //System.out.print("count is "+ count+" i is "+i);
                }
                else if(i==n/2)
                {
                    count+=0;
                }
                else
                {
                    count-=(n+n+n);
                }
            }
            //System.out.print("count is "+ count+" i is "+i);
            System.out.println();
        }
      scn.close ();
    }
}