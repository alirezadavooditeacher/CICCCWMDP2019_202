package program4;

import program1.StudentPojo;

public class GPACheck implements CheckElement<StudentPojo> {

	@Override
	public boolean check(StudentPojo t) {
		// TODO Auto-generated method stub
		if (t.getGpa()>60) return true;
		
		return false;
	}	
}
