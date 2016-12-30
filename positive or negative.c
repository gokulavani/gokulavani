#include<stdio.h>
#include<conio.h>
int main()
{
int num;
printf(*"enter the number:");
scanf("%d",&num);
if(num>0)
{
printf("the value is positive:%d",num);}
if(num==0)
{
printf("the value is eqval to zero:%d",num);
}
if(num<0)
{
printf("the value is negative:%d",num);}
return 0;}
