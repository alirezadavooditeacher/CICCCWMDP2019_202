package Student;

import Student.StudentServiceProtocolInterface;

public class StudentServicesProvider {

    public StudentServiceProtocolInterface delegate;

    public void receiveService() {
        StudentService students = this.delegate.studentService();

        System.out.println(students.getName());
        System.out.println(students.getSemester());


    }


}
