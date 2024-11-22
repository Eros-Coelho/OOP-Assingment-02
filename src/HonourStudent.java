/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class HonourStudent extends Student{

public HonourStudent (String firstName, String lastName, int student_id, int credits, int years){
    super(firstName, lastName, student_id);
    setYears(4);
    setCredits(360);
        }

//        displayInfo method to print out every but of information about BSCH students
    public void displayInfo(){
        System.out.println("BSCH Student Info: \nName: " + getFirstName() + " " + getLastname() + "\nEmail: " + getFirstName().toLowerCase() + "." + getLastname().toLowerCase() + "@student.griffith.ie" + "\nStudent ID: " + getStudent_id() + "\nCredits: " + getCredits() + "\nYears: " + getYears());
        System.out.println();
    }
}