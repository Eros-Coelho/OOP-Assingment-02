/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class OrdinaryStudent extends Student{

    public OrdinaryStudent (String firstName, String lastName, int student_id, int credits, int years){
        super(firstName, lastName, student_id);
        setYears(years);
        setCredits(300);
    }

    //        displayInfo method to print out every but of information about BSCO students
    public void displayInfo(){
        System.out.println("BSCO Student Info: \nName: " + getFirstName() + " " + getLastname() + "\nEmail: " + getFirstName().toLowerCase() + "." + getLastname().toLowerCase() + "@student.griffith.ie" + "\nStudent ID: " + getStudent_id() + "\nCredits: " + getCredits() + "\nYears: " + getYears());
        System.out.println();
    }
}
