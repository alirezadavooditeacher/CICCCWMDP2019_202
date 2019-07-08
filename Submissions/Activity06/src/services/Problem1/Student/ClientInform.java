package services.Problem1.Student;

public class ClientInform implements StudentServiceInformProtocolInterface {
    private StudentServiceProvider studentServiceProvider;

    public void setStudentServiceProvider(StudentServiceProvider studentServiceProvider) {
        this.studentServiceProvider = studentServiceProvider;
        this.studentServiceProvider.delegate = this;
    }

    @Override
    public void inform(String message) {
        System.out.println(message);
    }

    @Override
    public StudentService studentService() {
        return new StudentService("Marcus", 5);
    }

}
