public class Human {

    String name;
    long age;
    String address;

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }



    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void hunt(){
        System.out.println("Human Can hunt");
    }

    public Human(){

    }


    public Human(String name, long age){
        this.age=age;
        this.name=name;
        this.address=address;
    }

    public Human(String name, long age, String address){
        this.age=age;
        this.name=name;

        this.address=address;
    }

    //Overloading
//    It is Possible for Both method and the constructor




    public void walking() {
        System.out.println("Walking");
    }

    public void eat() {
        System.out.println("Eating");
    }


}
