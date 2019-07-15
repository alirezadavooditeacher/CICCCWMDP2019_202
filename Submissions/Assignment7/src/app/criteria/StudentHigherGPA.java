package app.criteria;

import app.entity.Student;

import java.util.List;

public class StudentHigherGPA extends Criteria<Student> {
    @Override
    public boolean satisfied(Student el, List<Student> data) {
        float mean = this.mean(data);
        return el.getGpa() > mean;
    }

    private float mean(List<Student> data) {
        int total = 0;
        for (Student el : data) {
            total += el.getGpa();
        }

        return total / data.size();
    }
}

