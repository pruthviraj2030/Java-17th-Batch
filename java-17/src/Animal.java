public class Animal {




   String name="Dog";
   Human human=new Human();
    public void setNoLegsCount(Long noLegsCount) {
        this.noLegsCount = noLegsCount;
    }

    Long noLegsCount;


    // Polymorphism



    public Long getNoLegsCount() {
        return noLegsCount;
    }

    public void walk(){
        System.out.println("walking");
    }
    public void hunt() {
        System.out.println("It can't Hunt");
    }

    public void drink(){
        System.out.println("Drinking water");
    }


}
