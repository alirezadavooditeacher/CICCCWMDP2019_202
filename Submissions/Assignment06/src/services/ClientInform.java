package services;

public class ClientInform implements StudentServiceInformProtocolInterface {
    private StudentServicesProvider studentServiceProvider;

    public void setStudentServiceProvider(StudentServicesProvider studentServiceProvider) {
        this.studentServiceProvider = studentServiceProvider;
        this.studentServiceProvider.delegate = this;
    }

    @Override
    public void inform(String message) {
        System.out.println("Message received: " + message);
    }

    @Override
    public StudentService studentService() {
        return new StudentService("John Doe");
    }
}
