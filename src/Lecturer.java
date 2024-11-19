/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class Lecturer extends Account{

    private String office;

    public Lecturer(String firstName, String lastName, String office){
        super(firstName, lastName, generateEmail(firstName, lastName));
        this.office = office;
    }

//    Creating a method to generate the lecturer's email using the string firstName and lastName
//    *I put the generateEmail method on both the Student and Lecturer classes because they are different, ie "@student.griffith.ie" vs "@griffith.ie"
    private static String generateEmail(String firstName, String lastName){
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@griffith.ie";
    }

//    getters and setters for the String office, which the lecturer must have
    public String getOffice(){
        return office;
    }
    public void setOffice(String office){
        this.office = office;
    }
}
