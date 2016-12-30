#include<stdio.h>
#include<conio.h>
int main()
{long long n;
int count=0;
printf("enter the number :");
scanf("%lld",&n);
while(n!=0)
{
    n=n/10;

        ++count;

}printf("%d",count);
return 0;}
