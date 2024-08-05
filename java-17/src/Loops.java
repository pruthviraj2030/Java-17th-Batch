import java.util.*;

public class Loops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number= sc.nextInt();
        short sho= sc.nextShort();
        sc.nextByte();
        sc.nextBoolean();

        String string=sc.nextLine();
        String string1=sc.next();

        char c = sc.next().charAt(0);

        boolean prime=true;
        for(int i = 2 ; i<number ; i++ ){
            if(number % i == 0){
                prime = false;
                System.out.println(" not a prime number");
                break;
            }
        }
        if (prime)
            System.out.println("prime number");
    }
}
