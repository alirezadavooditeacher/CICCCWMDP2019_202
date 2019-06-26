# Assignment 4

## Note about the application

- The current semester is always 3, and there is no way to change it throught app.
- The semester is between 1 and 4.
- The app choose courses randomly for the new students since the app has no functionality to choose the course.
- As for the "Show My Profile", the app does not print the future course (semester 4). Becase it says "Taken So far".


## Note about the class design, implementation

Some definitions of the classes do not make scenes for me. So I made some changes.

### Student

- Added "student ID" from StudentProfile. Becase I think the ID is should be managed by the central entity.
- Removed "admission year of the student" since it is duplicated in StudentProfile.
- Moved "number of year in university" to StudentProfile. Since this is same sort of information which is represented in StudentProfile.
- Replaced "general transcript" and "semester transcript" with TranscriptCollection. (See "GeneralTranscript and SemesterTranscript" bellow for the detail).

### StudentProfile

- Added "number of year in university" which is originaly defined in Student.
- Moved "Student ID" to Student.

### School

- I added a new class School which maintains "name of the school", "short name of the scool (CICCC)", "available courses" and "students".
- A Manager belongs to a school.

### Course

- Moved "Student’s grade" to Transcript. Because the relationship between course and students should be one-to-many, not ont-to-one.
- Moved "The number of semester the course is taken" to Transcript too for the same reason.
- So, the Course class's concern are only "name", "code", and "units"

### GeneralTranscript and SemesterTranscript

- I added Transcript and TranscriptCollection instead of "GeneralTranscript" and "SemesterTranscript".
- Transcript represents the same as GeneralTranscript but one instance represents only one course for one student.
- Transcript has additional valuess "Student's grade", "The number of semester the course is taken" which is moved from Course.
- TranscriptCollection has a list of Transcript and it has methods to maintain the list (filter, count, add .. etc).

### Command classes

- The idea is similar to command-pattern from GOF;
- It is excluded form the diagram since it takes too much space.

## The diagram

![application diagram](./application-diagram.png)