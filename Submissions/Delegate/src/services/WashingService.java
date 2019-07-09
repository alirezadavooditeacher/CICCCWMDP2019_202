package services;

public class WashingService extends HomeService {
    private boolean white;
    private int amount;

    public WashingService(String description) {
        super(description);
        this.amount = amount;
        this.white = white;

    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
