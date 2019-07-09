package services.Problem1.Student;

import services.Problem1.Provider;

public class StudentServiceProvider extends Provider {

    private String name;
    public StudentServiceProtocolInterface delegate;

    public StudentServiceProvider(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void receiveService() {

        StudentService ss = this.delegate.studentService();

        ss.play();
        System.out.println(ss.getStrength());
        ss.study();
        System.out.println(ss.getExperience());

        if (delegate instanceof StudentServiceInformProtocolInterface) {
            ((StudentServiceInformProtocolInterface) this.delegate).inform("Service finished.");
        }
    }
}
