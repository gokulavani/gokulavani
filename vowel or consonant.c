#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("enter the character:");
scanf("%c",&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
printf("the character is vowel:%c",ch);
}
else{
    printf("the character is consonant:%c",ch);

}
return 0;}
