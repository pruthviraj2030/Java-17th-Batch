public class Palindrome {
    public static void main(String[] args) {
        String palindrome="Madamh";
        palindrome=palindrome.toUpperCase();
        boolean isPalindrome=true;
        int endIndex= palindrome.length()-1;
        for(int i=0;i<palindrome.length()/2;i++){
            if(palindrome.charAt(i)!=palindrome.charAt(endIndex-i)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");

    }
}
