package stream;

import data.Student;
import data.StudentDatabase;
import methodreferences.RefactorMethodReferenceExample;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudents().stream()
                .filter(RefactorMethodReferenceExample::greaterThanGpa)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDatabase.getAllStudents().stream()
                .filter(RefactorMethodReferenceExample::greaterThanGpa)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> student1=findAnyStudent();
        if(student1.isPresent()){
            System.out.println("Student with Gpa greater than 3.8 "+ student1.get());
        }
        else{
            System.out.println("No Student found");
        }

        Optional<Student> student2=findFirstStudent();
        if(student2.isPresent()){
            System.out.println("Student with Gpa greater than 3.8 "+ student2.get());
        }
        else{
            System.out.println("No Student found");
        }
    }
}
