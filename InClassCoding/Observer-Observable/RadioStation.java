
public class RadioStation implements MyObserver{

	@Override
	public void update(MyObservable mo, Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("RadioStation: "+((Weather)mo).getTemprature());
	}

}
