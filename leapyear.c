#include<stdio.h>
#include<conio.h>
int main()
{
int year;
printf("enter the year:");
scanf("%d",&year);
if(year%4==0&&year%100!=10&&year%400!=0)
{

    printf("the year ir leap year:%d",year);

}
else{
    printf("the year is not leap year :%d",year);
}
return 0;}
