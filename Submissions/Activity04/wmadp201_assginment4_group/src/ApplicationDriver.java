package wmadp201_assginment4_group.src;

import wmadp201_assginment4_group.src.Transcript.CurrentSemesterTranscript;
import wmadp201_assginment4_group.src.Transcript.GeneralTranscript;

/**
 * Application Driver
 */
public class ApplicationDriver {

    public static void main(String[] args) {

        EducationalPortal educationalPortal = new EducationalPortal();
        setSampleData(educationalPortal);
        setSampleData2(educationalPortal);
        setSampleData3(educationalPortal);
        setSampleCourses(educationalPortal);
        Manager manager = new Manager("Jason", "Wang", "president");
        EducationalPortal.setManager(manager);

        educationalPortal.start();
    }

    /**
     * Make some sample data
     * Because this application doesn't have offline data
     */
    private static void setSampleData(EducationalPortal educationalPortal) {
        String firstName = "Marcus";
        String lastName = "Araki";
        char gender = 'M';
        String country = "Japan";
        String address = "345 Homer St, BC, Canada";
        int age = 27;
        int yearOfAdmission = 2018;

        String userName = "marcus";
        String password = "marcus88";
        String studentId = educationalPortal.getNewStudentId();
        StudentProfile sp = new StudentProfile(firstName, lastName, gender, country, address, age, yearOfAdmission, studentId);
        Student student = new Student(sp);
        Account account = new Account(userName, password, student);
        GeneralTranscript gt = new GeneralTranscript();
        TakenCourse takenCourse = new TakenCourse(getSampleCourses101(), 89, 1);
        TakenCourse takenCourse2 = new TakenCourse(getSampleCourses201(), 80, 1);
        TakenCourse takenCourse3 = new TakenCourse(getSampleCourses202(), 95, 2);
        TakenCourse takenCourse4 = new TakenCourse(getSampleCourses301(), 80, 3);
        TakenCourse takenCourse5 = new TakenCourse(getSampleCourses302(), 92, 3);
        TakenCourse takenCourse6 = new TakenCourse(getSampleCourses401(), 96, 3);
        gt.addTakenCourses(takenCourse);
        gt.addTakenCourses(takenCourse2);
        gt.addTakenCourses(takenCourse3);
        gt.addTakenCourses(takenCourse4);
        gt.addTakenCourses(takenCourse5);
        gt.addTakenCourses(takenCourse6);
        CurrentSemesterTranscript cst = new CurrentSemesterTranscript();
        cst.addTakenCourses(takenCourse4);
        cst.addTakenCourses(takenCourse5);
        cst.addTakenCourses(takenCourse6);
        account.getStudent().setGt(gt);
        account.getStudent().setCst(cst);
        educationalPortal.addAccounts(account);
    }

    private static void setSampleData2(EducationalPortal educationalPortal) {
        String firstName = "Jenny";
        String lastName = "Brown";
        char gender = 'F';
        String country = "America";
        String address = "334 Skeena St, BC, Canada";
        int age = 22;
        int yearOfAdmission = 2017;

        String userName = "jenny";
        String password = "jenny88";
        String studentId = educationalPortal.getNewStudentId();
        StudentProfile sp = new StudentProfile(firstName, lastName, gender, country, address, age, yearOfAdmission, studentId);
        Student student = new Student(sp);
        Account account = new Account(userName, password, student);
        GeneralTranscript gt = new GeneralTranscript();
        TakenCourse takenCourse = new TakenCourse(getSampleCourses101(), 80, 1);
        TakenCourse takenCourse2 = new TakenCourse(getSampleCourses102(), 71, 2);
        TakenCourse takenCourse3 = new TakenCourse(getSampleCourses201(), 81, 3);
        TakenCourse takenCourse4 = new TakenCourse(getSampleCourses202(), 75, 5);
        TakenCourse takenCourse5 = new TakenCourse(getSampleCourses201(), 73, 5);
        TakenCourse takenCourse6 = new TakenCourse(getSampleCourses302(), 72, 5);
        gt.addTakenCourses(takenCourse);
        gt.addTakenCourses(takenCourse2);
        gt.addTakenCourses(takenCourse3);
        gt.addTakenCourses(takenCourse4);
        gt.addTakenCourses(takenCourse5);
        gt.addTakenCourses(takenCourse6);
        CurrentSemesterTranscript cst = new CurrentSemesterTranscript();
        cst.addTakenCourses(takenCourse4);
        cst.addTakenCourses(takenCourse5);
        cst.addTakenCourses(takenCourse6);
        account.getStudent().setGt(gt);
        account.getStudent().setCst(cst);
        educationalPortal.addAccounts(account);
    }

    private static void setSampleData3(EducationalPortal educationalPortal) {
        String firstName = "Tom";
        String lastName = "Brown";
        char gender = 'O';
        String country = "India";
        String address = "5433 Richard St, BC, Canada";
        int age = 20;
        int yearOfAdmission = 2018;

        String userName = "browns";
        String password = "browns88";
        String studentId = educationalPortal.getNewStudentId();
        StudentProfile sp = new StudentProfile(firstName, lastName, gender, country, address, age, yearOfAdmission, studentId);
        Student student = new Student(sp);
        Account account = new Account(userName, password, student);
        GeneralTranscript gt = new GeneralTranscript();
        TakenCourse takenCourse = new TakenCourse(getSampleCourses101(), 80, 1);
        TakenCourse takenCourse2 = new TakenCourse(getSampleCourses102(), 71, 2);
        TakenCourse takenCourse3 = new TakenCourse(getSampleCourses201(), 81, 2);
        TakenCourse takenCourse4 = new TakenCourse(getSampleCourses202(), 75, 3);
        TakenCourse takenCourse5 = new TakenCourse(getSampleCourses402(), 78, 3);
        TakenCourse takenCourse6 = new TakenCourse(getSampleCourses501(), 79, 3);
        gt.addTakenCourses(takenCourse);
        gt.addTakenCourses(takenCourse2);
        gt.addTakenCourses(takenCourse3);
        gt.addTakenCourses(takenCourse4);
        gt.addTakenCourses(takenCourse5);
        gt.addTakenCourses(takenCourse6);
        CurrentSemesterTranscript cst = new CurrentSemesterTranscript();
        cst.addTakenCourses(takenCourse4);
        cst.addTakenCourses(takenCourse5);
        cst.addTakenCourses(takenCourse6);
        account.getStudent().setGt(gt);
        account.getStudent().setCst(cst);
        educationalPortal.addAccounts(account);
    }

    private static void setSampleCourses(EducationalPortal educationalPortal) {

        Course course101 = getSampleCourses101();
        educationalPortal.addCourses(course101);

        Course course102 = getSampleCourses102();
        educationalPortal.addCourses(course102);

        Course course201 = getSampleCourses201();
        educationalPortal.addCourses(course201);

        Course course202 = getSampleCourses202();
        educationalPortal.addCourses(course202);

        Course course301 = getSampleCourses301();
        educationalPortal.addCourses(course301);

        Course course302 = getSampleCourses302();
        educationalPortal.addCourses(course302);

        Course course401 = getSampleCourses401();
        educationalPortal.addCourses(course401);

        Course course402 = getSampleCourses402();
        educationalPortal.addCourses(course402);

        Course course501 = getSampleCourses501();
        educationalPortal.addCourses(course501);

        Course course502 = getSampleCourses502();
        educationalPortal.addCourses(course502);

    }

    private static Course getSampleCourses101() {

        String courseName = "Objective-C";
        String courseCode = "MADP101";
        int units = 3;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses102() {

        String courseName = "Object-Oriented Programming";
        String courseCode = "MADP102";
        int units = 2;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses201() {

        String courseName = "Problem Solving";
        String courseCode = "MADP201";
        int units = 1;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses202() {

        String courseName = "Project Management";
        String courseCode = "MADP202";
        int units = 3;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses301() {

        String courseName = "Java Programming";
        String courseCode = "MADP301";
        int units = 3;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses302() {

        String courseName = "Web Development";
        String courseCode = "MADP302";
        int units = 2;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses401() {

        String courseName = "Android Programming";
        String courseCode = "MADP401";
        int units = 2;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses402() {

        String courseName = "iOS Applications";
        String courseCode = "MADP402";
        int units = 3;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses501() {

        String courseName = "Ruby";
        String courseCode = "MADP501";
        int units = 2;

        return new Course(courseName, courseCode, units);
    }

    private static Course getSampleCourses502() {

        String courseName = "RubyOnRails";
        String courseCode = "MADP501";
        int units = 1;

        return new Course(courseName, courseCode, units);
    }

}
