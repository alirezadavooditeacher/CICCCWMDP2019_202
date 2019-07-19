package main;


import app.Counter;
import app.Exchange;


import java.awt.print.Book;
import java.util.ArrayList;

import Criteria.StudentGpaHigherThanAverage;
import Model_Classes.Student;

public class ApplicationDriver {

    public static void main(String[] args) {

    	// #1 problem 
        StudentCount();
  
    }

   

    private static void StudentCount() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pedro", "lara", 0));
        students.add(new Student("joao", "silva", 86));
        students.add(new Student("janete", "ferreira", 61));
        students.add(new Student("Guilherme", "Silveira", 75));

        Counter<Student> studentCounter = new Counter<>(students);
        StudentGpaHigherThanAverage criteria = new StudentGpaHigherThanAverage();
        studentCounter.countNumberOfElementsWithSpecificProperty(criteria);
        int count = studentCounter.countNumberOfElementsWithSpecificProperty(criteria);
        System.out.format("%d people are higher than the average", count);
        System.out.println();
    }



    private static void exchangeElements() {
        Integer[] numbers = {1, 2};
        System.out.print("Before: ");
        dumpElements(numbers);

        Exchange.exchangeElements(numbers);

        System.out.print("After : ");
        dumpElements(numbers);
    }

    private static <T> void dumpElements(T[] data) {
        System.out.format("{%s, %s}", data[0], data[1]);
        System.out.println();
    }

}
