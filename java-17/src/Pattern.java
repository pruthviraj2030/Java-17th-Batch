import java.util.concurrent.locks.ReentrantLock;

public class Pattern {
    public static void main(String[] args) {
        incresing(5);
        dec(5);
    }

    private static void dec(int n) {

        for(int i = 1; i<= n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("*"+" ");
            }
            for(int j=1;j<2*(n-(n-i))-1;j++)
                System.out.print(" " +" ");

            for(int j=n;j>=i;j--){
                System.out.print("*"+ " ");
            }


            System.out.println();
        }
    }


    public static void incresing(int n){


        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++ ) //1
                System.out.print("*"+" ");
            for(int l=1;l<=2*(n-i);l++)
                System.out.print(" "+" ");
            for(int k=1;k<=i;k++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
}
