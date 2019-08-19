package default_package;

import java.util.Scanner;

public class Courses {
	Scanner read = new Scanner(System.in);
	//course name
	private int object_C;  //3 units
	private int object_OP; //2
	private int problem_S; //1
	private int project_M; //3
	private int java_P;    //3
	private int web_D;     //2 
	private int android_P; //2 
	private int ios_A;     //3
	
	public Courses(int object_C, int object_OP, int problem_S, int project_M, int java_P, int web_D,
			int android_P, int ios_A) {
		super();
		this.object_C = object_C;
		this.object_OP = object_OP;
		this.problem_S = problem_S;
		this.project_M = project_M;
		this.java_P = java_P;
		this.web_D = web_D;
		this.android_P = android_P;
		this.ios_A = ios_A;
	}
	
	public int getObject_C() {
		return object_C;
	}
	public void setObject_C(int object_C) {
		this.object_C = object_C;
	}
	public int getObject_OP() {
		return object_OP;
	}
	public void setObject_OP(int object_OP) {
		this.object_OP = object_OP;
	}
	public int getProblem_S() {
		return problem_S;
	}
	public void setProblem_S(int problem_S) {
		this.problem_S = problem_S;
	}
	public int getProject_M() {
		return project_M;
	}
	public void setProject_M(int project_M) {
		this.project_M = project_M;
	}
	public int getJava_P() {
		return java_P;
	}
	public void setJava_P(int java_P) {
		this.java_P = java_P;
	}
	public int getWeb_D() {
		return web_D;
	}
	public void setWeb_D(int web_D) {
		this.web_D = web_D;
	}
	public int getAndroid_P() {
		return android_P;
	}
	public void setAndroid_P(int android_P) {
		this.android_P = android_P;
	}
	public int getIos_A() {
		return ios_A;
	}
	public void setIos_A(int ios_A) {
		this.ios_A = ios_A;
	}
	
}
