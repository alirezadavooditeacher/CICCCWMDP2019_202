package services;

public class Service {
    private String description;
    private String startDate;
    private String expectedEndDate;

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getExpectedEndDate() {
        return expectedEndDate;
    }

    public Service(String description, String startDate, String expectedEndDate){
        this.description = description;
        this.startDate = startDate;
        this.expectedEndDate = expectedEndDate;
    }
}
