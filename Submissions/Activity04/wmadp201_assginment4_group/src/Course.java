package wmadp201_assginment4_group.src;

public class Course {
    private String name;
    private String code;
    private int units;

    public Course(String name, String code, int units) {
        this.name = name;
        this.code = code;
        this.units = units;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public int getUnits() {
        return this.units;
    }
}
