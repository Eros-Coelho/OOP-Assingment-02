/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public class Test {

    public static void main(String[] args) {

//        creating lecturer objects so i can create subject objects
        Lecturer lecturer1 = new Lecturer("Erwin", "Smith", "Mathematics");
        Lecturer lecturer2 = new Lecturer("Zoe", "Hange", "Computing Science");
        Lecturer lecturer3 = new Lecturer("Jaime", "O'Sullivan", "English");

//        creating 3 subject objects; 2 with honour student credits, 1 with ordinary student credits
        Subject subject1 = new Subject("Linear Algebra", lecturer1, 360);
        Subject subject2 = new Subject("Computer Programming", lecturer2, 360);
        Subject subject3 = new Subject("English 101", lecturer3, 300);

//        creating student objects for honour and ordinary students
//        created 5 of each, using the concrete classes HonourStudent and OrdinaryStudent, since we cannot instantiate abstract classes such as Student
        HonourStudent student1 = new HonourStudent("Michael", "Hunt", 1, 360);
        HonourStudent student2 = new HonourStudent("Seamus", "McCarthy", 2, 360);
        HonourStudent student3 = new HonourStudent("Niamh", "Fitzhenry", 3, 360);
        HonourStudent student4 = new HonourStudent("Clarissa", "Fitzgerald", 4, 360);
        HonourStudent student5 = new HonourStudent("Alfred", "Pennyworth", 5, 360);

        OrdinaryStudent student6 = new OrdinaryStudent("Alice", "Wonderland", 6, 300);
        OrdinaryStudent student7 = new OrdinaryStudent("Andrew", "Garfield", 7, 300);
        OrdinaryStudent student8 = new OrdinaryStudent("Peter", "Parkinson", 8, 300);
        OrdinaryStudent student9 = new OrdinaryStudent("Siobhan", "Gomez", 9, 300);
        OrdinaryStudent student0 = new OrdinaryStudent("Sarah", "Mulcahy", 10, 300);
    }
}