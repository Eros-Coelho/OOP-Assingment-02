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

//    public int getCredits(){
//        return credits;
//    }
//
//    public int getYears(){
//        return years;
//    }

    public void displayInfo(){

    }
}
