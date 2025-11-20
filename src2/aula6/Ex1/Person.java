package aula6.Ex1;

// Atributos da Person
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String street;
    private String nat;
// Construtor
    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
// Métodos
    // Gets
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getStreet(){
        return street;
    }
    public String getNat(){
        return nat;
    }
    // Sets
    public void setFirstName (String newFirstName){
        this.firstName = newFirstName;
     }
    public void setLastName (String newLastName){
        this.lastName = newLastName;
    }
    public void setAge (int newAge){
        this.age = newAge;
    }
    public void setStreet (String newStreet){
        this.street = newStreet;
    }
    public void newNat (String newNat){
        this.nat = newNat;
    }

    @Override
    public String toString(){
        return "O nome é " + getFirstName() + " "
                + getLastName() + " e tenho " + getAge() + "anos.";
    }


}

