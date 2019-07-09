package services;

public class HomeServiceProvider {
    public HomeServiceProtocolInterface delegate;

    public void reveiveService(){
        System.out.println("Home Service.");
        CookingService cookingService = delegate.cookingService();
        if (cookingService != null){
            cook(cookingService);
        }
        WashingService washingService = delegate.washingService();
        if (washingService != null){
            wash(washingService);
        }
        BabySittingService babySittingService = delegate.babysittingService();
        if (babySittingService != null){
            babysit(babySittingService);
        }

    }
    public void cook(CookingService service) {
        System.out.println("description"+ service.getDescription());
        System.out.println("food" + service.getFood());
        System.out.println("price" + service.getPrice());
    }
    public void wash(WashingService service){
        String clothes;
        if(service.isWhite()){
            clothes = "wash alone";
        }else{
            clothes = "wash together";
        }
        System.out.println("description"+ service.getDescription());
        System.out.println("amount" + service.getAmount());
        System.out.println("white" + clothes);

    }
    public void babysit(BabySittingService service){
        System.out.println("description"+ service.getDescription());
        System.out.println("hour"+ service.getHour());
        System.out.println("babyname" + service.getBabyName());
    }
}
