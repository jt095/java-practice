package Collections.PeopleList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new java.util.ArrayList<>(List.of(
                new Person(1, "Daisy"),
                new Person(2, "Sonny"),
                new Person(29, "Jay"),
                new Person(30, "Abby"),
                new Person(23, "Jenna")
        ));

        people.sort(Comparator.comparingInt(Person::getAge));
        for(Person p: people){
            System.out.println(p.getName() + ": "+ p.getAge());
        }
    }
}
