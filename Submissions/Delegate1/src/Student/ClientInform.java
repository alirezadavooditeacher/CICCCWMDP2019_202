package Student;

public class ClientInform implements StudentSerciveInformProtocolInterface{
    private StudentServicesProvider studentServicesProvider = new StudentServicesProvider();


    public ClientInform(StudentServicesProvider studentServicesProvider) {
        this.studentServicesProvider = studentServicesProvider;
        this.studentServicesProvider.delegate = this;
    }
    @Override
    public StudentService studentService() {
        return new StudentService("Cedric", 2);
    }

    @Override
    public void inform(String message) {
        System.out.println("Message received" + message);

    }

}
