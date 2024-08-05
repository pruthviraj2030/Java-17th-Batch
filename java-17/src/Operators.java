public class Operators {
    public static void main(String[] args) {

//        https://www.linkedin.com/jobs/view/3978454843


        boolean weekday=false,vacation=false;

        //  We sleep in if it is not a weekday or we're on vacation


        if(!weekday){
            System.out.println("Sleeping");
        } else if (vacation) {
            System.out.println("Sleeping");
        } else
            System.out.println("Not sleeping");


        if(!weekday || vacation )
            System.out.println("Sleeping");

        else
            System.out.println("Not Sleeping");


    }
}
