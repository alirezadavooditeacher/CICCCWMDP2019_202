package services;

public class CarRepairProvider {
    public CarRepairServiceProtocolInterface delegate;

    public void receiveService() {
        CarRepairService service = delegate.carRepairService();
        System.out.format("description: %s, model: %s\n", service.getDescription(), service.getModel());
    }
}