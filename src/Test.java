/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

//        creating lecturer objects so I can create subject objects
        Lecturer lecturer1 = new Lecturer("Irwin", "Smith", "Mathematics");
        Lecturer lecturer2 = new Lecturer("Zoe", "O'Connor", "Computing Science");
        Lecturer lecturer3 = new Lecturer("Jaime", "O'Sullivan", "English");

//        creating 3 subject objects; 2 with honour student credits, 1 with ordinary student credits
        Subject subject1 = new Subject("Linear Algebra", lecturer1, 360);
        Subject subject2 = new Subject("Computer Programming", lecturer2, 360);
        Subject subject3 = new Subject("English 101", lecturer3, 300);

//        creating student objects for honour and ordinary students
//        created 5 of each, using the concrete classes HonourStudent and OrdinaryStudent, since we cannot instantiate abstract classes such as Student
        HonourStudent student1 = new HonourStudent("Michael", "O'Flannagan", 1, 360, 4);
        HonourStudent student2 = new HonourStudent("Seamus", "McCarthy", 2, 360, 4);
        HonourStudent student3 = new HonourStudent("Niamh", "Fitzhenry", 3, 360, 4);
        HonourStudent student4 = new HonourStudent("Clarissa", "Fitzgerald", 4, 360, 4);
        HonourStudent student5 = new HonourStudent("Alfred", "Howard", 5, 360, 4);

        OrdinaryStudent student6 = new OrdinaryStudent("Alice", "Day", 6, 300, 3);
        OrdinaryStudent student7 = new OrdinaryStudent("Andrew", "Walsh", 7, 300, 3);
        OrdinaryStudent student8 = new OrdinaryStudent("Peter", "Hogan", 8, 300, 2);
        OrdinaryStudent student9 = new OrdinaryStudent("Siobhan", "Gomez", 9, 300, 3);
        OrdinaryStudent student0 = new OrdinaryStudent("Sarah", "Mulcahy", 10, 300, 2);

//        enrolling students on subject 1
        subject1.enrol(student1);
        subject1.enrol(student2);
        subject1.enrol(student3);
        subject1.enrol(student4);

//        enrolling students into subject2, using both enrol methods, and also enrolling some of the same students enrolled in subject1
        subject2.enrol(student2);
        subject2.enrol(student5);
        subject2.enrol(student3);
        subject2.enrol("John", "Grey", 12, 4);
        subject2.enrol("Mary", "Jane", 13, 4);

//       same thing with subject3, though tried to only enrol ordinary students only into the subject which offers 300 credits
        subject3.enrol(student6);
        subject3.enrol(student7);
        subject3.enrol(student8);
        subject3.enrol(student9);
        subject3.enrol(student0);
        subject3.enrol("Tobias", "Hunt", 14, 3);

//        implementing methods to print each subject's details
        subjectDetails(subject1);
        subjectDetails(subject2);
        subjectDetails(subject3);

        sharedStudentInfo(subject1, subject2, subject3);
    }

//    method to sort students into either BSCH or BSCO, depending on where they are enrolled
    private static void subjectDetails(Subject subject) {
        System.out.println("Students enrolled in " + subject.getTitle() + ": ");
        for (Student student : subject.getRoster()){
            String studentType = (student instanceof HonourStudent) ? "BSCH" : "BSCO";
            System.out.println(student.getFirstName() + " " + student.getLastname() + " (" + studentType + ")");
        }
        System.out.println();
    }

//    uses ArrayList to check whether a student is enrolled in more than one subject, if so, checks if they're in the group sharedStudents, if not, they aare added
    private static void sharedStudentInfo(Subject subject1, Subject subject2, Subject subject3){
        ArrayList<Student> sharedStudents = new ArrayList<>();
        for (Student student : subject1.getRoster()){
            if (subject2.getRoster().contains(student) || subject3.getRoster().contains(student)){
                if (!sharedStudents.contains(student)){
                    sharedStudents.add(student);
                }
            }
        }
//        uses a for each loop to print out all the details of students enrolled in more than one subject
        System.out.println("Students enrolled in more than one subject: ");
        for(Student student : sharedStudents){
            student.displayInfo();
        }
    }
//    Tried to comment as much as possible, but also to be concise so not to drag on needlessly
}