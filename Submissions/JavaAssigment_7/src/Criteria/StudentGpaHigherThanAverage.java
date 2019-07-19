package Criteria;

import java.util.List;

import Model_Classes.Student;

public class StudentGpaHigherThanAverage extends Criteria<Student> {
    @Override
    public boolean satisfied(Student el, List<Student> data) {
        float avearege = this.mean(data);
        return el.getGpa() > avearege;
    }

    private float mean(List<Student> data) {
        int total = 0;
        for (Student el : data) {
            total += el.getGpa();
        }

        return total / data.size();
    }
}

