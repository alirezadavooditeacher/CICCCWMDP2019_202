public class Table implements CollectingDatesInterface {

	CollectingDatesInterface view;
	
	
	public Table(CollectingDatesInterface view) {
		super();
		this.view = view;
	}


	@Override
	public void showTable() {
		// TODO Auto-generated method stub
		this.view.showTable();
	}
	
}
