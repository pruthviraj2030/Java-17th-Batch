public class Recurssion {

    public static void main(String[] args) {
      hiCount(50);
    }
    static void hiCount(long n){
       if(n==0)
           return;
        System.out.println(n);
        hiCount(n-1);

    }

}
