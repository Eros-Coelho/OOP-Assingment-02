/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class HonourStudent extends Student{

private int credits;
private int years;

public HonourStudent (String firstName, String lastName, int student_id, int credits){
    super(firstName, lastName, student_id);
    this.years = 4;
    this.credits = 360;
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