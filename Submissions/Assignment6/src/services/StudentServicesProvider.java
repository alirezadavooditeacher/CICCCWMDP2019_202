package services;

public class StudentServicesProvider {
    public StudentServiceProtocolInterface delegate;

    public void receiveService() {
        StudentService service = delegate.studentService();
        System.out.format("Student Service: %s\n", service.getName());

        if (delegate instanceof StudentServiceInformProtocolInterface) {
            ((StudentServiceInformProtocolInterface) delegate).inform("finished");
        }
    }
}
