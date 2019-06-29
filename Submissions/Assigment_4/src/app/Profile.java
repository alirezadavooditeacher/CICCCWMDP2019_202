package app;

public class Profile {
  int studentId;
  String fristName;
  String lastName;
  String gender;
  String address;
  String countryOfOrigin;
  int age;
  int yearOfAdmission;

  public Profile(int studentId, String fristName, String lastName, String gender, String country, int age,
      int admissionYear) {
    this.fristName = fristName;
    this.lastName = lastName;
    this.gender = gender;
    this.countryOfOrigin = country;
    this.age = age;
    this.yearOfAdmission = admissionYear;
  }

  // public Profile(int studentId, String fristName, String lastName, String
  // gender, String address,
  // String countryOfOrigin, int age, int yearOfAdmission) {
  // super();
  // this.studentId = studentId;
  // this.fristName = fristName;
  // this.lastName = lastName;
  // this.gender = gender;
  // this.address = address;
  // this.countryOfOrigin = countryOfOrigin;
  // this.age = age;
  // this.yearOfAdmission = yearOfAdmission;
  // }
}
