#include<stdio.h>
int main()
{
	//code
	int i,j,t,A,d,k,tmp;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
	    scanf("%d",&A);
	    int prime[A+1];
        for(j=2;j<A+1;j++)
        {
            prime[j]=1;
        }
        prime[0]=prime[1]=0;
        for(j=2;j<=(int)sqrt(A);j++)
        {
            if(prime[j])
            {
                for(k=2;j*k<=A;k++)
                {
                    prime[j*k]=0;
                }
            }
        }
        for(j=2;j<A;j++)
        {
            if(prime[j])
            {
               for(k=1;k<=(A/j);k++)
               {
                   if((j*k<=A)&&(prime[k]))
                   printf("%d %d ",j,k);
               }
            }
        }
        printf("\n");
	}
	return 0;
}