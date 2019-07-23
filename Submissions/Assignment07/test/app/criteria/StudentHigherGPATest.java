package app.criteria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.entity.Student;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentHigherGPATest {
    StudentHigherGPA criteria;
    ArrayList<Student> students;

    @BeforeEach
    void setUp() {
        criteria = new StudentHigherGPA();

        students = new ArrayList<>();
        students.add(new Student("First1", "Last1", 90));
        students.add(new Student("First2", "Last2", 80));
        students.add(new Student("First3", "Last3", 70));
        students.add(new Student("First4", "Last4", 60));
    }

    @Test
    void satisfiedReturnsTrueIfTheStudentHasHigherGPAThanTheAverage() {
        assertTrue(criteria.satisfied(students.get(0), students));
        assertTrue(criteria.satisfied(students.get(1), students));
    }

    @Test
    void satisfiedReturnsTrueIfTheStudentHasLessThanOrEqualGPAThanTheAverage() {
        assertFalse(criteria.satisfied(students.get(2), students));
        assertFalse(criteria.satisfied(students.get(3), students));
    }
}