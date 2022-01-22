package Base.Package;

import Base.Package.Person.Person;
import Base.Package.Person.PersonFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        HashMap<String, HashSet<Person>> personMap = new PersonFactory().createPersonsMap();
        printPersonMap(personMap);

        HashSet<Person> personList = personMap.get("Y");
        Person person = personList.stream().filter(x -> x.getId() == 1).findFirst().get();

        person.addPhoneNumber("05464182562");
        person.addPhoneNumber("22222222");

        person.addAddress("address 1");
        person.addAddress("address 100");

    }

    private static void printPersonMap(HashMap<String, HashSet<Person>> personMap){
        BiConsumer<String, HashSet<Person>> consumer = (key, value) -> {
            System.out.println("Map Key : " +key);
            System.out.println("Value Count : " +value.size());
            System.out.println("Values : " );

            Consumer<Person> printNumbersAndAdresses = (person) -> {

                System.out.println("Id :" +person.getId() +", Name : " +person.getName() +", LastName : " +person.getLastName());

                System.out.println("Phone Numbers :");
                person.getPhonenumbers().forEach(System.out::println);

                System.out.println("Adresses :");
                person.getAdresses().forEach(System.out::println);
            };

            value.forEach(printNumbersAndAdresses);
        };

        personMap.forEach(consumer);

    }
}
