#include<stdio.h>
#include<conio.h>
int main()
{
int n1,n2,n3,large;
printf("enter the first value :");scanf("%d",&n1);
printf("enter the second value :");
scanf("%d",&n2);
printf("enter the third value:");
scanf("%d",&n3);
large=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
printf("the  large value is:%d ",large);

return 0;}
