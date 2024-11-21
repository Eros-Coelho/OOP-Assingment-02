/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.util.ArrayList;

public class Subject implements Roster {

    private String title;
    private Lecturer lecturer;
    private int credits;
    private ArrayList<Student> roster;

    public Subject (String title, Lecturer lecturer, int credits) {
        this.title = title;
        this.lecturer = lecturer;
        this.credits = credits;
        this.roster = new ArrayList<>();
    }

//    getters and setters for Subject class variables
    public String getTitle(){
        return title;
    }

    public Lecturer getLecturer(){
        return lecturer;
    }

    public int getCredits(){
        return credits;
    }

    public ArrayList<Student> getRoster(){
        return roster;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public void setRoster(ArrayList<Student> roster){
        this.roster = roster;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(roster);
    }

    @Override
    public ArrayList<HonourStudent> getBSCHStudent() {
        ArrayList<HonourStudent> bschStudents = new ArrayList<>();
        for (Student student : roster){
            if (student instanceof HonourStudent){
                bschStudents.add((HonourStudent) student);
            }
        } return bschStudents;
    }

    @Override
    public ArrayList<OrdinaryStudent> getBSCOStudents() {
        ArrayList<OrdinaryStudent> bscoStudents = new ArrayList<>();
        for (Student student : roster){
            if (student instanceof OrdinaryStudent){
                bscoStudents.add((OrdinaryStudent) student);
            }
        } return bscoStudents;
    }

    @Override
    public Student getStudent(int student_id){
        for (Student student : roster){
            if (student_id == student.getStudent_id()){
                return student;
            }
        } return null;
    }

    @Override
    public ArrayList<Student> getStudents(String name) {
        return null;
    }

    @Override
    public ArrayList<Student> getStudent(String name){
        ArrayList<Student> studentsWithName = new ArrayList<>();
        for (Student student : roster){
            if ((student.getFirstName() + " " + student.getLastname()).equalsIgnoreCase(name));
        } return studentsWithName;
    }

//    if the student was not enrolled, add them to the roster and then return true; return false otherwise
    @Override
    public boolean enrol(Student student) {
        if (!roster.contains(student)){
            roster.add(student);
            return true;
        } return false;
    }

//    returning the boolean enrol as false if the student is already enrolled (checking by their student id)
    @Override
    public boolean enrol(String firstName, String surname, int student_id, int years) {
        for (Student student : roster){
            if (student.getStudent_id() == student_id){
                return false;
            }
        }
//        new student object just created, first checks if years = 4, if so, assign them to HonourStudent
        Student newStudent;
        if (years == 4){
            newStudent = new HonourStudent(firstName, surname, student_id, 360, 4);
        } else {
            newStudent = new OrdinaryStudent(firstName, surname, student_id, 300, 4);
        }
        roster.add(newStudent);
        return true;
    }

// Remember: either use or remove this (and also from the interface)
//    @Override
//    public boolean enrol() {
//        return false;
//    }
}