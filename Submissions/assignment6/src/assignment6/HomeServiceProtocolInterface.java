package assignment6;

public class HomeServiceProtocolInterface {

    public interface HomeServiceProtocolInterface() {
        public CookingService cookingService();
        public WashingService washingService();
        public BabySittingService babySittingService();
    }

}
