package services;

public class WashingService extends HomeService {
    private Integer amount;

    public WashingService(String description, Integer amount) {
        super(description);
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
