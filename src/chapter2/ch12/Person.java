package chapter2.ch12;

public class Person {

    String name;
    int age;

    public Person(){
        this("park", 30);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person = " + person.name);
        System.out.println("person = " + person.age);

        Person findPerson = person.getPerson();

        System.out.println("person = " + person);
        System.out.println("findPerson = " + findPerson);
    }
}
