import java.util.ArrayList;
import problem0.*;
import problem1.*;
import problem2.*;
import problem3.*;

public class Driver {
    public static void main(String[] args) {
        problem0();
        problem1();
        problem2();
        problem3();
    }

    private static void problem3() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(  );
        arrayList.add( 10 );
        arrayList.add( 109 );
        arrayList.add( 10 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 112 );
        arrayList.add( 14 );
        System.out.println( "\n-------- problem 3 --------" );
        Problem3.problem3(arrayList);
    }

    private static void problem2() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(  );
        arrayList.add( 10 );
        arrayList.add( 109 );
        arrayList.add( 10 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 112 );
        arrayList.add( 14 );
        System.out.println( "\n-------- problem 2 --------" );
        Problem2.problem2(arrayList);
    }

    private static void problem1() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(  );
        arrayList.add( 10 );
        arrayList.add( 109 );
        arrayList.add( 10 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 112 );
        arrayList.add( 14 );
        System.out.println( "\n-------- problem 1 --------" );
        Problem1.problem1(arrayList);
    }

    public static void problem0(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(  );
        arrayList.add( 10 );
        arrayList.add( 109 );
        arrayList.add( 10 );
        arrayList.add( 10 );
        arrayList.add( 14 );
        arrayList.add( 112 );
        arrayList.add( 14 );
        System.out.println( "-------- problem 0 --------" );
        Problem0.problem0arrayList(arrayList);
    }
}
