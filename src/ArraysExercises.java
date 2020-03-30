import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        // why does this need a toString?
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // array is just a pointer to location in memory



        //Create an array that holds 3 Person objects.
        Person[] people = new Person[3];

        // Assign a new instance of the Person class to each element.
        people[0] = new Person("Casey");
        people[1] = new Person("Vivian");
        people[2] = new Person("Trant");

        // Iterate through the array and print out the name of each person in the array.
        for(Person person : people) {
            System.out.println("\t" + person.getName());
        }

        System.out.println();

        Person addition = new Person("Brance");
        Person[] updatedPeople = addPerson(people, addition);

        for(Person person : updatedPeople) {
            System.out.println("\t" + person.getName());
        }

    }

    public static Person[] addPerson(Person[] inputPeople, Person inputPerson) {
        Person[] newPeeps = new Person[inputPeople.length + 1];


        for(int i=0; i < inputPeople.length; i++) {
            newPeeps[i] = inputPeople[i];
        }
        // we have all but the last person assigned to the array

        newPeeps[newPeeps.length-1] = inputPerson;

        return newPeeps;
    }



}
