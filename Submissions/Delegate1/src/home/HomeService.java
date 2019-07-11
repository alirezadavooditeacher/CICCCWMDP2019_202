package home;

public abstract class HomeService {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HomeService(String description) {
        this.description = description;
    }
}
