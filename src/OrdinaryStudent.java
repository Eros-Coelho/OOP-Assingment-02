/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class OrdinaryStudent extends Student{

    private int credits;
    private int years;

    public OrdinaryStudent (String firstName, String lastName, int student_id, int credits){
        super(firstName, lastName, student_id);
        this.years = 3;
        this.credits = 300;
    }

    public int getCredits(){
        return credits;
    }

    public int getYears(){
        return years;
    }

    public void displayInfo(){

    }
}
