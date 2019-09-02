import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private static int costOfCourse = 600;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int id = 1000;
    private String studentID;

    // Constructor: prompt user to enter student's name and year
    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1. - Freshmen\n2. - Sophomore\n3. - Junior\n4. - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // Generate an ID
    private void setStudentID() {

        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;


    }

    // Enroll in courses
    public void enroll() {

        // Get inside a loop, user hits q
        while (true) {
            System.out.print("Enter course to enroll (Q to quit):");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine();


            if (!course.toUpperCase().equals("Q")) {

                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {

                break;

            }
        }

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: $" + tuitionBalance);

    }


    // View balance
    public void viewBalance() {

        System.out.println("Your balance is: $" + tuitionBalance);

    }

    // Pay tuition
    public void payTuition() {

        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    // Show status
    @Override
    public String toString() {

        return "Name: " + firstName + " " + lastName + "\n" +
                "Grade level: " + gradeYear + "\n" +
                "Courses enrolled: " + courses + "\n" +
                "Balance: $" + tuitionBalance;

    }


}
