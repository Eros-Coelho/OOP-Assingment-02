/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class Test {

    public static void main(String[] args) {

//        creating lecturer objects so i can create subject objects
        Lecturer lecturer1 = new Lecturer("Erwin", "Smith", "Mathematics");
        Lecturer lecturer2 = new Lecturer("Mary", "O'Connor", "Computing Science");
        Lecturer lecturer3 = new Lecturer("Jaime", "O'Sullivan", "English");

//        creating 3 subject objects; 2 with honour student credits, 1 with ordinary student credits
        Subject subject1 = new Subject("Linear Algebra", lecturer1, 360);
        Subject subject2 = new Subject("Computer Programming", lecturer2, 360);
        Subject subject3 = new Subject("English 101", lecturer3, 300);
    }
}