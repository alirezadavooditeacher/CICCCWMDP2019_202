package problem1;

public class POJO {
    private String building;
    private String street;
    private int floor;

    public POJO(String building, String street, int floor) {
        this.building = building;
        this.street = street;
        this.floor = floor;
    }

    public String getStreet() {
        return street;
    }
}
