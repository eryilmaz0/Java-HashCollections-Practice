package Base.Package.Person;

import java.util.HashMap;
import java.util.HashSet;

public class PersonFactory {

    public HashMap<String, HashSet<Person>> createPersonsMap(){

        HashMap<String, HashSet<Person>> personMap = new HashMap<String, HashSet<Person>>();

        //Adding Persons Into Map
        HashSet<Person> persons1 = new HashSet<>();
        HashSet<Person> persons2 = new HashSet<>();
        HashSet<String> phoneNumbers, adresses;

        phoneNumbers = new HashSet<>();
        phoneNumbers.add("11111111");
        phoneNumbers.add("11111111");
        phoneNumbers.add("22222222");

        adresses = new HashSet<>();
        adresses.add("address 1");
        adresses.add("address 1");
        adresses.add("address 2");

        persons1.add(new Person(1, "Eren", "Yılmaz", phoneNumbers, adresses));

        phoneNumbers = new HashSet<>();
        phoneNumbers.add("33333333");
        phoneNumbers.add("33333333");
        phoneNumbers.add("44444444");

        adresses = new HashSet<>();
        adresses.add("address 3");
        adresses.add("address 3");
        adresses.add("address 4");

        persons1.add(new Person(2, "Zehra", "Yılmaz", phoneNumbers, adresses));


        phoneNumbers = new HashSet<>();
        phoneNumbers.add("55555555");
        phoneNumbers.add("66666666");
        phoneNumbers.add("77777777");

        adresses = new HashSet<>();
        adresses.add("address 5");
        adresses.add("address 5");
        adresses.add("address 5");

        persons2.add(new Person(3, "Ahmet", "Kandemir", phoneNumbers, adresses));

        phoneNumbers = new HashSet<>();
        phoneNumbers.add("88888888");

        adresses = new HashSet<>();
        adresses.add("address 6");

        persons2.add(new Person(4, "Melis", "Kaya", phoneNumbers, adresses));

        personMap.put("Y", persons1);
        personMap.put("K", persons2);
        return personMap;
    }
}
