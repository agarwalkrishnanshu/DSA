package Arrays;
import java.util.*;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        boolean prime[] = new boolean[A+1];
        ArrayList<Integer> p = new ArrayList<Integer>();
        //Finding all the prime numbers upto A
        for(int i=2;i<A+1;i++)
        {
            prime[i]=true;
        }
        for(int i=2;i<=(int)Math.sqrt(A);i++)
        {
            if(prime[i])
            {
                for(int j=2;i*j<=A;j++)
                {
                    prime[i*j]=false;
                }
            }
        }
        //Finding prime numbers whose sum is equal to A
        for(int i=0;i<A;i++)
        {
            if(prime[i] && prime[A-i])
            {
                p.add(i);
                p.add(A-i);
                break;
            }
        }
        return p;
    }
}