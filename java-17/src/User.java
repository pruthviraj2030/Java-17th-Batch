public class User {

    long id;
    String name;
    long age;
    String gender;
    String address;

    public User(long id, String name, long age, String gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName(){ return name;}

    public User() {

    }


}
