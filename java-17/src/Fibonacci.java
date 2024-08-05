public class Fibonacci {
    public static void main(String[] args) {
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
      //  System.out.print(0+" "+1+" ");
        int first=0,second=1;
        //extracted();

        System.out.println( fibonacci(50));
    }

    private static void extracted() {
        long firs=0,secon=1, sum   ,count=50;
        for(int i=2;i<count;++i) //8%
        {
            sum=firs+secon;
            System.out.print(" "+sum);
            firs=secon;
            secon=sum;
        }
    }


    public static long fibonacci(int n) {

        // 0 1  1 2 3 5 8 13 21 34 55
        if(n==1 || n==0)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);




    }

}
