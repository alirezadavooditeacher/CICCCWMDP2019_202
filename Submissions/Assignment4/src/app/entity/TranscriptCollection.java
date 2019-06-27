package app.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * TranscriptCollection
 *
 * This class maintain a collection of Transcript. This should be bound to a student as 1:1 relationship.
 */
public class TranscriptCollection implements Iterable<Transcript> {
    private List<Transcript> transcripts;

    /**
     * Constructor
     */
    public TranscriptCollection() {
        transcripts = new ArrayList<>();
    }

    /**
     * Constructor with initial dataset (to mock data)
     */
    public TranscriptCollection(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    /**
     * Add new course to the collection (a student take a course)
     *
     * @param course a course to take
     * @param semester a semester to take
     */
    public void addCourse(Course course, int semester) {
        // The application has no way to evaluate the grade. So set random grade here.
        Random random = new Random();
        int grade = random.nextInt(50) + 50;
        transcripts.add(new Transcript(course, semester, grade));
    }

    /**
     * Find a transcript which has the same course
     *
     * @param course course to find
     * @return a Transcript if found, otherwise null
     */
    public Transcript findByCourse(Course course) {
        for (Transcript item : transcripts) {
            if (item.getCourse() == course) {
                return item;
            }
        }

        return null;
    }

    /**
     * Filter the collection by specific semester.
     * This is useful for represent a Transcript collection for the current semester.
     *
     * @param semester semester to filter
     * @return a new TranscriptCollection which
     */
    public TranscriptCollection filterBySemester(int semester) {
        List<Transcript> filtered = new ArrayList<>();
        for (Transcript transcript : transcripts) {
            if (transcript.getSemester() == semester) {
                filtered.add(transcript);
            }
        }

        return new TranscriptCollection(filtered);
    }

    /**
     * Count transcriptions which is taken in the semester
     *
     * @param semester semester to calculate
     * @return number of transcription which is taken in the semester
     */
    public int countCoursesInSemester(int semester) {
        return filterBySemester(semester).size();
    }

    /**
     * Calculate GPA (average of grades) from the collection of transcript
     *
     * @return gap
     */
    public double calculateGPA() {
        int total = 0;
        for (Transcript item : this) {
            total += item.getGrade();
        }
        return (double) total / size();
    }

    /**
     * Count the collection size
     *
     * @return number of transcripts
     */
    public int size() {
        return transcripts.size();
    }

    @Override
    public Iterator<Transcript> iterator() {
        return transcripts.iterator();
    }

    @Override
    public void forEach(Consumer<? super Transcript> action) {
        transcripts.forEach(action);
    }
}
