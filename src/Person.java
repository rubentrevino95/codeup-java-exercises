public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, I'm %s.%n", name);
    }

    public static void main(String[] args) {

        // test person methods
        String testName = "James";
        Person person = new Person(testName);
        if (person.getName().equals(testName)) {
            person.sayHello();
        } else {
            System.out.println("name mis-match");
        }

        testName = "Mary";
        person.setName(testName);
        if (person.getName().equals(testName)) {
            person.sayHello();
        } else {
            System.out.println("name mis-match");
        }

        // EX 2: understanding references
        Exercise02();
    }


    private static void Exercise02() {

        // EX 2: understanding references
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        System.out.println(person1.getName().equals(person2.getName())); // should be true
        System.out.println(person1 == person2);                          // Should be false

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1 == person2); // should be true

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane
    }
}
