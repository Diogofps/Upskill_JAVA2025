package aula6.Ex1e2;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String nat;

    public Person (String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public String getNat(){
        return nat;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setNat(String nat){
        this.nat=nat;
    }

    @Override
    public String toString(){
        return "O meu nome é "+getFirstName()+" "+getLastName()+" "+ "e tenho "+getAge()+" "+"anos.";
    }
}
