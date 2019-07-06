import services.*;

public class ApplicationDriver {

    public static void main(String[] args) {
        Client client = new Client("Ali", "Vancouver", "778");

        // Painting
        PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
        client.setPaintingProvider(provider);
        provider.receiveService();

        // Clearing
        CleaningProvider cProvider = new CleaningProvider();
        client.setCleaningProvider(cProvider);
        cProvider.receiveService();

        // Car Repair
        CarRepairProvider carProvider = new CarRepairProvider();
        client.setCarRepairProvider(carProvider);
        carProvider.receiveService();

        // Home
        HomeServiceProvider homeServiceProvider = new HomeServiceProvider();
        client.setHomeServiceProvider(homeServiceProvider);
        homeServiceProvider.receiveService();

        // Student
        StudentServicesProvider studentServicesProvider = new StudentServicesProvider();
        client.setStudentServiceProvider(studentServicesProvider);
        studentServicesProvider.receiveService();

        // Student + finished message
        ClientInform client2 = new ClientInform();
        client2.setStudentServiceProvider(studentServicesProvider);
        studentServicesProvider.receiveService();
    }

}
