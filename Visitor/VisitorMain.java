package Visitor;

public class VisitorMain {

    public static void main(String[] args) {

        Person oldPerson = new Person.Builder("Harry", "Potter").phone("934").address("London").age(21).build();

        System.out.println(oldPerson);

    }
}
