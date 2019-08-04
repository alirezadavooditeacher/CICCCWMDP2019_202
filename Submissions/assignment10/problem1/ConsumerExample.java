//package assignment10.problem1;
//
///**
// * Consumer interface represents an operation that accepts a single input argument and returns no result.
// *
// * 単一の入力引数を受け取って結果を返さないオペレーションを表します。Consumerは他のほとんどの関数型インタフェースと異なり、
// * 副作用を介して動作することを期待されます。
// *
// * Consumer / 消費者
// * Consumerは引数を消費するインスタンスを定義するためのインターフェイス。
// *
// * この課題では、それぞれの機能インターフェースについて1つの例を考えます。
// * この目的のために、それぞれの組み込み機能インターフェースについて、問題を思いつき、
// * 機能インターフェースを使用して解決できる1,2行の問題記述を書きます。
// */
//
//// Make a students' list and print them with Counsumer interface.
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class ConsumerExample {
//
//    public static void main(String[] args) {
//
//        List studentList = createStudentList();
////        Consumer c = s -> System.out.println("name: "+s.getName()+"\nAge: "+s.getAge()+"\n"); // Doesn't work
//        studentList.forEach(c);
//
//    }
//
//    public static List createStudentList() {
//        List studentList = new ArrayList();
//        Student s1 = new Student("studentA",20);
//        Student s2 = new Student("studentB",21);
//        Student s3 = new Student("studentC",22);
//        Student s4 = new Student("studentD",23);
//        Student s5 = new Student("studentE",24);
//        Student s6 = new Student("studentF",25);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);
//        studentList.add(s6);
//        return studentList;
//    }
//
//
//}
//
//
//// Student class------------------------------------------------------
//
//class Student {
//
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//}
