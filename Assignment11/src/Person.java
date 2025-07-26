import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        Person person = new Person(18, "Pawan");
        Person person1 = new Person(20, "Yash");

        System.out.println(person1.equals(person));
    }
}
