package baseInterface;

import service.HomeService;

public interface HomeServiceProtocolInterface extends BaseInterface {
	public HomeService cooking();
	public HomeService doingTheDishes();
	public HomeService babySitting();
}
