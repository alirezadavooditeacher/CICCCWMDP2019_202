

import boundedgenerics.Box;
import boundedgenerics.MyNumber;
import boundedype.TestBoundedType;
import generics.OrderedPair;
import generics.Pair;
import generics.Util;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generics package test
//		Pair<String, Integer> pair1 = new OrderedPair<String, Integer>("Seven",7);
//		
//		Pair<String, String> pair2 = new OrderedPair<String, String> ("Seven", "Haft");
//		Pair<String, String> pair3 = new OrderedPair<String, String> ("Seven", "Haft");
//		
//		((OrderedPair<String, Integer>)pair1).printOrderedPair();
//		
//		((OrderedPair<String, String>)pair2).printOrderedPair();
//		
//		System.out.println(Util.filterKeyValueOfPair(pair2, false));
//		System.out.println(Util.compare(pair2, pair3));
//		
		//boundedgenerics package test
		
//		Box<Integer> integerBox = new Box<Integer>();
//        integerBox.set(10);
//        //integerBox.inspect("some text"); // error: this is still String!
//        integerBox.inspect(10); // error: this is still String!
		
		//boundedtype test
		TestBoundedType.test1();
		TestBoundedType.test2();
		
		Box<Number> b = new Box<Number>();
		
		b.add(Integer.valueOf("10"));
		b.add(10);
		b.add(10.34);
		b.add(new MyNumber(10));
		
	}

}
