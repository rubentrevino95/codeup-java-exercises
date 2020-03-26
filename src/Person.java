
// Textual representation how an object will look in the memory
// Whatever we write in class is in actual the property of object as describing the object
// If you want anything which should belong to class, make it static.

class Person {

// Attributes (State)
    String name;
    String lastName;

// Constructor
    Person(){
        System.out.println("Hello...");
    }

// Methods (Behavior)
// To write data in Product Object we have this method

    public String getName(){
        return String.format(name + lastName);
    }

    public void setName(String firstName, String lastName){
        this.name = "John";
        this.lastName = "Doe";
    }

    public String sayHello() {
        return String.format("Hello %s %s", name, lastName);
    }

// To read data from Product Object
    void showProductDetails(){
        System.out.println("Person...");
    }


        public static void main(String[] args) {
            // object creation
            Person person1 = new Person();
            Person person2 = person1;
            System.out.println(person1.getName());
            System.out.println(person2.getName());
            System.out.println(person1.getName());
            System.out.println(person2.getName());

        }
    }

