package services;

public class HomeServiceProvider {

	private HomeServiceProtocolInterface delegate;
	
	
	public HomeServiceProvider(HomeServiceProtocolInterface delegate) {
		super();
		this.delegate = delegate;
	}


	public void recieveService() {
		HomeService hs = this.delegate.babySitting();
		System.out.println(hs.getCategory());
		System.out.println(hs.getDescription());
		System.out.println(hs.getAge());
		System.out.println(hs.getGender());
	}
}
