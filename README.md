# include<stdio.h>
#include<conio.h>
void main()
{
int b,e,res=1;
printf("Enter the base number");
scanf("%d",&b);
printf("Enter the power number");
scanf("%d",&e);
while(e!=0)
{
res*=b;
}
if(e==0)
{
return 1;
}
printf("the power value:%d",res);
}
