package services;

public class HomeServiceProvider {
    public HomeServiceProtocolInterface delegate;

    public void receiveService() {
        System.out.println("Home Service!");
        CookingService cookingService = delegate.cookingService();
        if (cookingService != null) {
            cook(cookingService);
        }

        WashingService washingService = delegate.washingService();
        if (washingService != null) {
            wash(washingService);
        }

        BabysittingService babysitting = delegate.babysittingService();
        if (babysitting != null) {
            babysit(babysitting);
        }
    }

    public void cook(CookingService service) {
        String food;
        if (service.isVegan()) {
            food = "🥦🥒🍅";
        } else {
            food = "🍖🍖🍖🍖🍖🍖🍖";
        }

        System.out.format("description: %s. Let's cook %s\n", service.getDescription(), food);
    }

    public void wash(WashingService service) {
        System.out.format("description: %s, amount: %d\n", service.getDescription(), service.getAmount());
    }

    public void babysit(BabysittingService service) {
        System.out.format("description: %s, baby name: %s\n", service.getDescription(), service.getBabyName());
    }
}
