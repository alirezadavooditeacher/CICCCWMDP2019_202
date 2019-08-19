//package assignment9.problem2;
//
////Now consider the following class and complete the implementation of the anonymous classes.
//
//public class ApplicationDriver {
//
//    enum ShapeType
//        {
//            Rectangle,
//            Triangle,
//            Circle,
//            Square,
//            Custom
//        }
//
//    public static void main(String args[]){
//
//        int[] s1Sides = {10,20};
//        Shape s1=new Shape(ShapeType.Rectangle, s1Sides){
//
//            //complete the implementation of the anonymous inner class here
//            @Override
//            float perimeter() {
//                System.out.println("S1's permiter is: "s1.perimeter());
//                return s1.perimeter();
//            }
//
//            @Override
//            float area() {
//                System.out.println("S1's area is: "s1.area());
//                return s1.area();
//            }
//
//        };
//
//        s1.perimeter();
//        s1.area();
//
//
//        int[] s2Sides = {10};
//        Shape s2=new Shape(ShapeType.Square, s2Sides){
//
//            //complete the implementation of the anonymous inner class here
//            @Override
//            float perimeter() {
//                System.out.println("S2's permiter is: "+s2.perimeter());
//                return s2.perimeter();
//            }
//
//            @Override
//            float area() {
//                System.out.println("S1's area is: "+s2.area());
//                return s2.area();
//            }
//
//        };
//
//        s2.perimeter();
//        s2.area();
//
//
//        int[] s3Sides = {12};
//        Shape s3=new Shape(ShapeType.Circle, s3Sides){
//
//            //complete the implementation of the anonymous inner class here
//            @Override
//            float perimeter() {
//                System.out.println("S3's permiter is: "+s3.perimeter());
//                return s3.perimeter();
//            }
//
//            @Override
//            float area() {
//                System.out.println("S3's area is: "+s3.area());
//                return s3.area();
//            }
//
//        };
//
//        s3.perimeter();
//        s3.area();
//
//
//        int[] s4Sides = {8, 12, 12};
//        Shape s4=new Shape(ShapeType.Triangle, s4Sides){
//
//            //complete the implementation of the anonymous inner class here
//            @Override
//            float perimeter() {
//                System.out.println("S4's permiter is: "+s4.perimeter());
//                return s3.perimeter();
//            }
//
//            @Override
//            float area() {
//                System.out.println("S4's area is: "+s4.area());
//                return s3.area();
//            }
//
//        };
//
//        s4.perimeter();
//        s4.area();
//
//    }
//}
