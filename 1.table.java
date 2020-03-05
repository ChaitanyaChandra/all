public class test{
    public static void main(String[] args)
    {
        table(9);
        add(10000,100000);
    }
    public static void table(int m)
    {
        for ( int a = 1 ; (a <= 10)  ;a++)
            System.out.println(String.format("S.no.%d  %d*%d = %d ", a , m , a , a * m ));
    }
    public static void add(int a ,int b)
    {
        int c = a+b;
        System.out.println(String.format("\nthis is addition :%d", c));
    }

}

/*
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

this is addition :110000
 */