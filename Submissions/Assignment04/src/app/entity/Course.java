package app.entity;

/**
 * Course
 *
 * this class represents course information which belongs to a school
 */
public class Course {
    private String name;
    private String code;
    private int units;

    /**
     * Constructor
     *
     * @param name
     * @param code
     * @param units
     */
    public Course(String name, String code, int units) {
        this.name = name;
        this.code = code;
        this.units = units;
    }

    /**
     * Getter for name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for code
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter for units
     *
     * @return the value
     */
    public int getUnits() {
        return units;
    }
}
