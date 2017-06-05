#include<stdio.h>
#include<conio.h>
int main()
{
int b,p,res=1;
printf("Enter the base number");
scanf("%d",&b);
printf("\nenter the power value");
scanf("%d",&p);
while(p!=0)
{
res*=b;
p--;
}
printf("the power value:%d",res);
}
