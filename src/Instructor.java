import java.util.Arrays;

public class Instructor {
    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("%s was just created!\n", firstName);
        System.out.printf("Instuctor count: %d\n\n", numInstructors);


//      ARRAY CREATION

        Instructor[] team = new Instructor[3];


        Instructor casey = new Instructor("Casey", "friday");
        Instructor vivian = new Instructor("Vivian", "friday");
        Instructor trant = new Instructor("Trant", "friday");


        team[0] = casey;
        team[1] = vivian;
        team[2] = trant;

        for (Instructor instructor : team) {
            System.out.println(instructor);
        }

//        String[] firstNames = new String[team.length];
//        for (int i= 0; i < team.length; i++) {
//            firstNames[i] = team[i].getFirstName();
//        }


//        for (String firstName : firstNames) {
//            System.out.println(firstName);
//        }


    }
}
