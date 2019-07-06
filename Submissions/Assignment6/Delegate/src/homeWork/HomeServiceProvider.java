package homeWork;

public class HomeServiceProvider {
	private String name;
	private String address;
	private String company;
	public ServiceProtocolInterface delegate;
	
	public HomeServiceProvider(String name, String address, String company) {
		super();
		this.name = name;
		this.address = address;
		this.company = company;
	}
	public void recieveCookingService() {
		CookingService cks=this.delegate.cookService();
		System.out.println(cks.getFoodName());
		System.out.println(cks.getPortions());
		System.out.println(cks.getPrice());
		
	}
	public void recieveWashingService() {
		WashingService ws=this.delegate.washingService();
		System.out.println(ws.getDate());
		System.out.println(ws.getHour());
	}
	public void recieveBabbyService() {
		BabyService bs=this.delegate.babyService();
		System.out.println(bs.getDate());
		System.out.println(bs.getHour());
	}
}
