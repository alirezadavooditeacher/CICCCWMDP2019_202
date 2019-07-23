package app.entity;

/**
 * StudentProfile
 *
 * This class represents a student's profile information.
 */
public class StudentProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private String address;
    private String country;
    private int age;
    private int admissionYear;
    private int yearOfUniversity;

    /**
     * Getter for firstName
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for firstName
     * @param firstName the value
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for lastName
     * @return the value
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for lastName
     * @param lastName the value
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Setter for gender
     * @param gender the value
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Getter for address
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for address
     * @param address the value
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for country
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for country
     * @param country the value
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for age
     * @return the value
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for age
     * @param age the value
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter for admissionYear
     * @return the value
     */
    public int getAdmissionYear() {
        return admissionYear;
    }

    /**
     * Setter for admissionYear
     * @param admissionYear the value
     */
    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    /**
     * Setter for yearOfUniversity
     * @param yearOfUniversity the value
     */
    public void setYearOfUniversity(int yearOfUniversity) {
        this.yearOfUniversity = yearOfUniversity;
    }

    /**
     * String presentation of gender
     *
     * @return one of Male, Female, Other
     */
    public String getFullGender() {
        switch (gender) {
            case 'M':
                return "Male";
            case 'F':
                return "Female";
            case 'O':
            default:
                return "Other";
        }
    }

    /**
     * Personal title based on the gender
     * @return one of "Mr", "Ms", ""
     */
    public String getTitle() {
        if (gender == 'M') {
            return "Mr";
        }
        if (gender == 'F') {
            return "Ms";
        }
        return "";
    }

    /**
     * Personal pronoun
     *
     * @param capitalize true if you want to capitalize it
     * @return one of "He", "She", "They"
     */
    public String getPersonalPronoun(boolean capitalize) {
        String pronoun;
        if (gender == 'M') {
            pronoun = "he";
        } else if (gender == 'F') {
            pronoun = "she";
        } else {
            pronoun = "they";
        }

        if (!capitalize) {
            return pronoun;
        }
        return pronoun.substring(0, 1).toUpperCase() + pronoun.substring(1);
    }

    /**
     * Full name with the title
     * @return name with title like "Mr. Jack Jack"
     */
    public String getFullName() {
        if (gender == 'O') {
            return String.format("%s %s", firstName, lastName);
        }
        return String.format("%s. %s %s", getTitle(), firstName, lastName);
    }

}
