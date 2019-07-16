
public class NewStation implements MyObserver{

	@Override
	public void update(MyObservable mo, Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("NewsStation: "+((Weather)mo).getTemprature());
	}

}
