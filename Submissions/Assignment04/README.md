# Assignment 4

## Note about the application

- The current semester is always 3, and there is no way to change it through the app.
- The semester is between 1 and 4.
- The app chooses courses for the new students randomly since the app has no functionality to select the course.
- As for the "Show My Profile," the app does not print the future courses (semester 4). Because it says, "Taken So far."


## Note about the class design, implementation

Some definitions of the classes do not make scenes for me. So I made some changes.

### Student

- I moved "student ID" from StudentProfile. Because I think the central entity should manage the ID.
- I removed the "admission year of the student" since it appeared in StudentProfile too.
- I moved "number of year in university" to StudentProfile. Since this is the same sort of information which StudentProfile maintains.
- I replaced "general transcript" and "semester transcript" with TranscriptCollection. (See "GeneralTranscript and SemesterTranscript" below for the detail).

### StudentProfile

- I added "number of year in university," which is initially defined in Student.
- I moved "Student ID" to Student.

### School

- I added a new class School which maintains "name of the school," "short name of the school (CICCC)," "available courses," and "students."
- A Manager belongs to a school.

### Course

- I moved "Student’s grade" to Transcript. The relationship between course and students should be one-to-many, not one-to-one.
- I moved "The number of the semester the course is taken" to Transcript too for the same reason.
- So, the Course class's concern is only "name," "code," and "units."

### GeneralTranscript and SemesterTranscript

- I added classes "Transcript" and "TranscriptCollection" instead of "GeneralTranscript" and "SemesterTranscript".
- Transcript class represents the same as GeneralTranscript, but one instance represents only one course for one student.
- Transcript class has additional values "Student's grade," "The number of the semester the course is taken," which is moved from Course.
- TranscriptCollection class has a list of Transcript, and it has methods to maintain the list (filter, count, add ... etc.).

### Command classes

- The idea is similar to command-pattern from GOF;
- It is excluded from the diagram since it takes too much space.


## The diagram

![application diagram](./application-diagram.png)