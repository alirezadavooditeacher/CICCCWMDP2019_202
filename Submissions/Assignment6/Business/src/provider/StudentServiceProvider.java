package provider;

import baseInterface.*;
import service.*;

public class StudentServiceProvider extends Provider {
	private StudentServiceProtocolInterface delegate;

	public StudentServiceProvider(StudentServiceProtocolInterface delegate) {
		super();
		this.delegate = delegate;
	}
	
	public boolean receiveService() {
		StudentService ss = this.delegate.studentService();
		System.out.println(ss.getName());
		System.out.println(ss.getAge());
		
		return true ;
	}

	public void infom(boolean result) {
		// TODO Auto-generated method stub
		if (result) {
			System.out.println("Your process is done");
		} else {
			System.out.println("There is something wrong");
		}
	}
	
	
}
