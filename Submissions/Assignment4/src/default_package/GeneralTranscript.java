package default_package;

import java.util.ArrayList;

public class GeneralTranscript {
	double gd, sum = 0, gpa;
	int count = 0, id;
	ArrayList<Courses> cosList;
	public GeneralTranscript(ArrayList<Courses> cosList , int id) {
		this.cosList = cosList;
		this.id = id;
	}
	void InformationOfGeneralTranscript() {
		
		System.out.println(id+" :idd");
		if(cosList.get(id).getObject_C() > 0) {
			gd = cosList.get(id).getObject_C();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getObject_OP() > 0) {
			gd = cosList.get(id).getObject_OP();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getProblem_S() > 0) {
			gd = cosList.get(id).getProblem_S();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getProject_M() > 0) {
			gd = cosList.get(id).getProject_M();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getJava_P() > 0) {
			gd = cosList.get(id).getJava_P();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getWeb_D() > 0) {
			gd = cosList.get(id).getWeb_D();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getAndroid_P() > 0) {
			gd = cosList.get(id).getAndroid_P();
			sum += gd;
			this.count += 1;
		}
		if(cosList.get(id).getIos_A() > 0) {
			gd = cosList.get(id).getIos_A();
			sum += gd;
			this.count += 1;
		}
		this.gpa = sum / count;
		System.out.println("gpa: "+gpa);
		System.out.println("sum: "+sum);
		System.out.println("count: "+count);
	}
	public double getGpa() {
		return this.gpa;
	}
	public int getCount() {
		return this.count;
	}
	
}
