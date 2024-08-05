public class Strings {

    public static void main(String[] args) {
        String s="String";
        for(int i=0;i<s.length();i++){ //i=S
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j)); // j
            }
        }


    }
}
