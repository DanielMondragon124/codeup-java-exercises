import java.util.Arrays;
public class ArraysExcercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Scarlett Johansson");
        people[1] = new Person("Gal Gadot");
        people[2] = new Person("Angelina Jolie");

        for (Person person : people) {
            System.out.println(person.getName());
        }
        people = addPerson(people, new Person("Alice"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
