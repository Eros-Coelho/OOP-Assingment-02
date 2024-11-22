/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public abstract class Student extends Account{

    private int student_id;
    private int credits;
    private int years;

    public Student (String firstName, String lastName, int student_id) {
        super(firstName, lastName, generateEmail(firstName, lastName));
        this.student_id = student_id;
    }

    public int getCredits(){
        return credits;
    }

    public int getYears(){
        return years;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }

    public void setYears(int years){
        this.years = years;
    }

    //    I put the generateEmail method on both the Student and Lecturer classes because they are different, ie "@student.griffith.ie" vs "@griffith.ie"
    private static String generateEmail(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@student.griffith.ie";
    }

//    abstract method displayInfo, no body, hence abstract, but it is also implemented on HonourStudent and OrdinaryStudent
    public abstract void displayInfo();
}
