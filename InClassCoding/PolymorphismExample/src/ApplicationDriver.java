import java.util.ArrayList;
import java.util.Iterator;



public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass1 sc1 = new SuperClass1();
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		Class3 c3 = new Class3();
		Class4 c4 = new Class4();
		
//		sc1.method1();
//		c1.method1();
//		c2.method1();
//		c3.method1();
//		c4.method1();
		
		ArrayList<Class1> ar1 = new ArrayList<Class1>();
		
		
		ArrayList<Class2> ar2 = new ArrayList<Class2>();
		ArrayList<Class3> ar3 = new ArrayList<Class3>();
		ArrayList<Class4> ar4 = new ArrayList<Class4>();
		
		ArrayList<SuperClass1> scList = new ArrayList<SuperClass1>();
		scList.add(c1);
		scList.add(c2);
		scList.add(c3);
		scList.add(c4);
		
		Iterator<SuperClass1> it = scList.iterator();
		
		SuperClass1 sc2= new SuperClass1();
		sc2.method1();
		System.out.println("========");
		while(it.hasNext()) {
			SuperClass1 sc = it.next();
			sc.method1();
		}
		
		//c4.method4();
		
	}

}
