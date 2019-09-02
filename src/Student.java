import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse;

    // Constructor: prompt user to enter student's name and year
    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1. - Freshmen\n2. - Sophomore\n3. - Junior\n4. - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        System.out.println(firstName + " " + lastName + " " + gradeYear);


    }

    // Generate an ID

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status


}
