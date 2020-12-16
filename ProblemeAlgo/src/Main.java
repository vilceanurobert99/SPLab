public class Main {
    public static void main(String[] args) {
        //System.out.println(sumaCifre(26326));
        //System.out.println(inversareCifre(12678));
        //multimeNumere(111223333);
        //cifreBinare(102310);
        System.out.println(factorial(4));
    }

    public static int sumaCifre(int n)
    {
        int s = 0;
        int c;
        while(n>0)
        {
            c = n % 10;
            s = s + c;
            n = n / 10;

        }
        return s;
    }

    public static int inversareCifre(int n)
    {
        int invers = 0;
        int c;
        while(n > 0) /*atata timp cat numarul mai are cifre*/
        {
            c = n % 10;
            invers = invers*10 + c;
            n = n / 10;
        }

        return invers;
    }

    public static void multimeNumere(int n)
    {
        int c = 0;
        int p;
        int x;
        while(n > 0)
        {
            c = n % 10;
            int i=0;
            x=inversareCifre(n);
            while(x > 0)
            {

                p = x%10;
                if(c == p)
                {
                    i++;
                  }
            x = x/10;

            }
            if(i==1)
                System.out.print(c);
            n = n / 10;
        }
    }

    public static void cifreBinare(int n)
    {   int c;
        while(n>0)
        {
            c = n % 10;
            if( c == 1 || c == 0)
            {
                System.out.print(c);
            }
            n = n / 10;
        }
    }

    public static int factorial(int n)
    {   int p=1;
        int i = 1;
        while(i<=n)
        {
            p = p*i;
            i++;
        }
        return p;
    }

}
