package services;

public interface HomeServiceProtocolInterface extends ServiceProtocolInterface {
    public CookingService cookingService();
    public WashingService washingService();
    public BabysittingService babysittingService();
}
