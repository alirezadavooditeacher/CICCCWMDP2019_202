package provider;

import baseInterface.*;
import service.*;

public class CarRepairProvider extends Provider {
	
	public CarRepairServiceProtocolInterface delegate;

	public CarRepairProvider(CarRepairServiceProtocolInterface delegate) {
		super();
		this.delegate = delegate;
	}

	public void recieveService() {
		// TODO Auto-generated method stub
		CarRepairService crs = this.delegate.carRepairService();
		System.out.println(crs.getDescription());
		System.out.println(crs.getModel());
	}

	
}
