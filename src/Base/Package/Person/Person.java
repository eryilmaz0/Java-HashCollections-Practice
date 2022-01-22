package Base.Package.Person;

import java.util.HashSet;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private String lastName;
    private HashSet<String> phoneNumbers;
    private HashSet<String> adresses;


    public Person(int id, String name, String lastName, HashSet<String> phoneNumbers, HashSet<String> adresses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.adresses = adresses;
    }


    //Getters
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public HashSet<String> getPhonenumbers(){
        return this.phoneNumbers;
    }

    public HashSet<String> getAdresses(){
        return this.adresses;
    }


    //Setters
    public void addPhoneNumber(String number){
        this.phoneNumbers.add(number);
    }

    public void addAddress(String address){
        this.adresses.add(address);
    }


    //Overriding For Singularity Check
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Person)) return false;
        Person person = (Person) o;
        return this.id == person.getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
