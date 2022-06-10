// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
#include<stdio.h>
int main()
{
	//code
	int i,j,t,n,sum;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
	    scanf("%d",&n);
	    int ar[n];
	    //Taking input
	    sum=0;
	    for(j=0;j<n-1;j++)
	    {
	        scanf("%d",&ar[j]);
	    }
	    //My Code HERE
	    sum = (n*(n+1))/2;
	    for(j=0;j<n-1;j++)
	    {
	        sum = sum-ar[j];
	    }
	    printf("%d\n",sum);
	}
	return 0;
}