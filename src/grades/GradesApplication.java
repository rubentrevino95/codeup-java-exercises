package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) throws Exception {
        HashMap<String, Student> Students = new HashMap<>();

        Students.put("Ruben", new Student("Strife"));
        Students.put("Daniel", new Student("Caelum"));
        Students.put("Marlene", new Student("name"));
        Students.put("Fredo", new Student("Larry"));

        Random random = new Random();
        for (int i=0; i< 4; i++){
            Students.get("Cloud").addGrade(random.nextInt(100));
            Students.get("Noctis").addGrade(random.nextInt(100));
            Students.get("Aerith").addGrade(random.nextInt(100));
            Students.get("Lunafreya").addGrade(random.nextInt(100));
        }
        System.out.println("Github Usernames:");
        System.out.println(Students.keySet());

        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        String ghUser;
        boolean confirmation = true;
        do {
            ghUser = Input.getString("Which students stats would you like to view?");
            if (!Students.containsKey(ghUser)){
                System.out.println("no username was found");
            } else {
                Student thisStudent = Students.get(ghUser);
                System.out.println("Name: " + thisStudent.getName()+ "Github: " + ghUser + thisStudent.getGradeAverage());
            }
            confirmation = Input.yesNo("Would you like to see another? [Y/N]");

        } while(confirmation);

    }
}
