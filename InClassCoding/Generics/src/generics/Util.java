package generics;

public class Util {
	
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		return p1.getKey()==p2.getKey() && p1.getValue()==p2.getValue();
	}

	public static <E> E filterKeyValueOfPair(Pair<E,E> p, boolean flag) {
		if(flag==true) {
			return p.getKey();
		} else {
			return p.getValue();
		}
	}
}
