public class PalindromeNumber {
    public static void main(String[] args) {
        String str="ghvasgualkaefj";
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-(1+i))){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Is a palindrome");
    }

    private static void numberPalindrome(int n) {

        int copy=n;
        int reverse=0;

        if(n/n==0){
            System.out.println("Palindrome");
            return;
        }
        for(;n>0;){
          int last= n%10;
          reverse=(reverse*10)+last;
          n=n/10;
        }
        if(copy==reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
