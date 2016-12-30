#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("enter the character:");
scanf("%c",&ch);
if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
{
printf("this character is alphabets:%c",ch);
}
else{
    printf("this character is not alphabets:%c",ch);

}
return 0;}
