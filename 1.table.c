#include <stdio.h>
int main()
{
    int a ,b , m;
    printf("\nwhich table do you need ? :");
    scanf("%d",&m);
    printf("\ntable upto ? :");
    scanf("%d",&b);
    for ( a = 1 ; (a <= b)  ;a++)
        printf("\nS.no.%d  %d*%d = %d ", a , m , a , a * m );
    return 0;
}
/*
 which table do you need ? :9

table upto ? :10

S.no.1  9*1 = 9
S.no.2  9*2 = 18
S.no.3  9*3 = 27
S.no.4  9*4 = 36
S.no.5  9*5 = 45
S.no.6  9*6 = 54
S.no.7  9*7 = 63
S.no.8  9*8 = 72
S.no.9  9*9 = 81
S.no.10  9*10 = 90
 */