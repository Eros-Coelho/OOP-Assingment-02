/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.util.ArrayList;

public interface Roster {

    public ArrayList<Student> getStudents();

    public ArrayList<HonourStudent> getBSCHStudent();

    public ArrayList<OrdinaryStudent> getBSCOStudents();

    public Student getStudent(int student_id);

    public ArrayList<Student> getStudents(String name);

    ArrayList<Student> getStudent(String name);

    public boolean enrol(Student student);

    public boolean enrol(String firstName, String surname, int student_id, int years);

//    either use or remove
//    boolean enrol();
}