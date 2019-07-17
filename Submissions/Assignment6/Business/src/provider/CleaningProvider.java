
package provider;

import baseInterface.*;
import service.*;

public class CleaningProvider extends Provider {

	public CleaningServiceProtocolInterface delegate; //delegate
	
	public CleaningProvider(CleaningServiceProtocolInterface delegate) {
		super();
		this.delegate = delegate;
	}

	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		System.out.println(cs.getDescription());
	}
}