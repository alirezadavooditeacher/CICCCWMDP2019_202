import java.sql.SQLOutput;
import java.util.*;
import java.util.function.*;

public class Main {
    interface MyFunctionalInterface {
        void apply();
    }

    public static void main(String[] args) {
        HashMap<String, MyFunctionalInterface> fnInterface = new HashMap<>();

        fnInterface.put("BiConsumer", Main::biConsumer);
        fnInterface.put("BiFunction", Main::biFunction);
        fnInterface.put("BinaryOperator", Main::binaryOperator);
        fnInterface.put("BiPredicate", Main::biPredicate);
        fnInterface.put("BooleanSupplier", Main::booleanSupplier);
        fnInterface.put("Consumer", Main::consumer);
        fnInterface.put("DoubleBinaryOperator", Main::doubleBinaryOperator);
        fnInterface.put("DoubleConsumer", Main::doubleConsumer);
        fnInterface.put("DoubleFunction", Main::doubleFunction);
        fnInterface.put("DoublePredicate", Main::doublePredicate);
        fnInterface.put("DoubleSupplier", Main::doubleSupplier);
        fnInterface.put("DoubleToIntFunction", Main::doubleToIntFunction);
        fnInterface.put("DoubleToLongFunction", Main::doubleToLongFunction);
        fnInterface.put("DoubleUnaryOperator", Main::doubleUnaryOperator);
        fnInterface.put("Function", Main::function);
        fnInterface.put("IntBinaryOperator", Main::intBinaryOperator);
        fnInterface.put("IntConsumer", Main::intConsumer);
        fnInterface.put("IntFunction", Main::intFunction);
        fnInterface.put("IntPredicate", Main::intPredicate);
        fnInterface.put("IntSupplier", Main::intSupplier);
        fnInterface.put("IntToDoubleFunction", Main::intToDoubleFunction);
        fnInterface.put("IntToLongFunction", Main::intToLongFunction);
        fnInterface.put("IntUnaryOperator", Main::intUnaryOperator);
        fnInterface.put("LongBinaryOperator", Main::longBinaryOperator);
        fnInterface.put("LongConsumer", Main::longConsumer);
        fnInterface.put("LongFunction", Main::longFunction);
        fnInterface.put("LongPredicate", Main::longPredicate);
        fnInterface.put("LongSupplier", Main::longSupplier);
        fnInterface.put("LongToDoubleFunction", Main::longToDoubleFunction);
        fnInterface.put("LongToIntFunction", Main::longToIntFunction);
        fnInterface.put("LongUnaryOperator", Main::longUnaryOperator);
        fnInterface.put("ObjDoubleConsumer", Main::objDoubleConsumer);
        fnInterface.put("ObjIntConsumer", Main::objIntConsumer);
        fnInterface.put("ObjLongConsumer", Main::objLongConsumer);
        fnInterface.put("Predicate", Main::predicate);
        fnInterface.put("Supplier", Main::supplier);
        fnInterface.put("ToDoubleBiFunction", Main::toDoubleBiFunction);
        fnInterface.put("ToDoubleFunction", Main::toDoubleFunction);
        fnInterface.put("ToIntBiFunction", Main::toIntBiFunction);
        fnInterface.put("ToIntFunction", Main::toIntFunction);
        fnInterface.put("ToLongBiFunction", Main::toLongBiFunction);
        fnInterface.put("ToLongFunction", Main::toLongFunction);
        fnInterface.put("UnaryOperator", Main::unaryOperator);

        fnInterface.forEach((name, fn) -> {
            System.out.println(name);
            System.out.println("--------------------------------------------------");
            fn.apply();
            System.out.println();
        });
    }

    // see http://www.java2s.com/Tutorials/Java_Lambda/java_util_function_Reference.htm

    // BiConsumer<T,U>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html
    // Represents an operation that accepts two input arguments and returns no result.
    static void biConsumer() {
        HashMap<String, Integer> books = new HashMap<>();
        books.put("Sorcerer’s Stones", 76944);
        books.put("Chamber of Secrets", 107253);
        books.put("Prisoner of Azkaban", 107253);

        BiConsumer<String, Integer> dumpBooks = (title, words) -> {
            System.out.format("Harry Potter and the %s has %d words.", title, words);
            System.out.println();
        };
        books.forEach(dumpBooks);
    }

    // BiFunction<T,U,R>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/BiFunction.html
    // Represents a function that accepts two arguments and produces a result.
    static void biFunction() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(5, 2);
        numbers.put(8, 7);
        numbers.put(9, 3);

        BiFunction<Integer, Integer, String> divide = (a, b) -> {
            float result = a / b;
            return String.format("%d / %d = %.02f", a, b, result);
        };

        numbers.forEach((a, b) -> {
            System.out.println(divide.apply(a, b));
        });
    }

    // BinaryOperator<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html
    // Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
    static void binaryOperator() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        int result = numbers
                .stream()
                .reduce(0, multiply);
        System.out.format("The total is %d", result);
        System.out.println();
    }

    // BiPredicate<T,U>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/BiPredicate.html
    // Represents a predicate (boolean-valued function) of two arguments.
    static void biPredicate() {
        List<List<Integer>> numbers = new ArrayList<>();
        numbers.add(Arrays.asList(5, 2));
        numbers.add(Arrays.asList(8, 7));
        numbers.add(Arrays.asList(9, 3));

        BiPredicate<Integer, Integer> remainIsZero = (a, b) -> a % b == 0;

        numbers
                .stream()
                .filter(el -> remainIsZero.test(el.get(0), el.get(1)))
                .map(el -> String.format("remaining of %d / %d is 0", el.get(0), el.get(1)))
                .forEach(System.out::println);
    }

    // BooleanSupplier
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/BooleanSupplier.html
    // Represents a supplier of boolean-valued results.
    static void booleanSupplier() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Random r = new Random();
        BooleanSupplier randomBoolean = r::nextBoolean;

        numbers
                .stream()
                .filter((x) -> randomBoolean.getAsBoolean())
                .forEach(System.out::println);

    }

    // Consumer<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
    // Represents an operation that accepts a single input argument and returns no result.
    static void consumer() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Consumer<Integer> dumpIntegers = n -> System.out.format("%d\n", n);

        numbers
                .stream()
                .forEach(dumpIntegers);
    }

    // DoubleBinaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleBinaryOperator.html
    // Represents an operation upon two double-valued operands and producing a double-valued result.
    static void doubleBinaryOperator() {
        DoubleBinaryOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.applyAsDouble(6.3, 9.8));
    }

    // DoubleConsumer
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleConsumer.html
    // Represents an operation that accepts a single double-valued argument and returns no result.
    static void doubleConsumer() {
        DoubleConsumer dumpDouble = n -> System.out.format("%.02f\n", n);
        dumpDouble.accept(30.81234);
    }

    // DoubleFunction<R>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleFunction.html
    // Represents a function that accepts a double-valued argument and produces a result.
    static void doubleFunction() {
        DoubleFunction<Integer> floor = n -> (int) Math.floor(n);
        System.out.println(floor.apply(987.12345));
    }

    // DoublePredicate
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoublePredicate.html
    // Represents a predicate (boolean-valued function) of one double-valued argument.
    static void doublePredicate() {
        DoublePredicate lessThanThreshold = n -> n > .005;

        System.out.println(lessThanThreshold.test(0.004));
        System.out.println(lessThanThreshold.test(0.005000001));
        System.out.println();
    }

    // DoubleSupplier
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleSupplier.html
    // Represents a supplier of double-valued results.
    static void doubleSupplier() {
        Random r = new Random();
        DoubleSupplier randomDouble = r::nextDouble;

        System.out.println(randomDouble.getAsDouble());
    }

    // DoubleToIntFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToIntFunction.html
    // Represents a function that accepts a double-valued argument and produces an int-valued result.
    static void doubleToIntFunction() {
        DoubleToIntFunction doubleToInt = n -> (int) n;
        System.out.println(doubleToInt.applyAsInt(99.999));
    }

    // DoubleToLongFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToLongFunction.html
    // Represents a function that accepts a double-valued argument and produces a long-valued result.
    static void doubleToLongFunction() {
        DoubleToLongFunction doubleToInt = n -> (long) n;
        System.out.println(doubleToInt.applyAsLong(99.999));
    }

    // DoubleUnaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleUnaryOperator.html
    // Represents an operation on a single double-valued operand that produces a double-valued result.
    static void doubleUnaryOperator() {
        DoubleUnaryOperator triple = (x) -> x * x * x;
        System.out.println(triple.applyAsDouble(99.999));
    }

    // Function<T,R>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
    // Represents a function that accepts one argument and produces a result.
    static void function() {
        Function<String, Integer> parseInteger = s -> Integer.valueOf(s);
        System.out.println(parseInteger.apply("10109"));
    }

    // IntBinaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntBinaryOperator.html
    // Represents an operation upon two int-valued operands and producing an int-valued result.
    static void intBinaryOperator() {
        IntBinaryOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.applyAsInt(6, 9));
    }

    // IntConsumer
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntConsumer.html
    // Represents an operation that accepts a single int-valued argument and returns no result.
    static void intConsumer() {
        IntConsumer dumpInt = n -> System.out.format("%d\n", n);
        dumpInt.accept(3081234);
    }

    // IntFunction<R>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html
    // Represents a function that accepts an int-valued argument and produces a result.
    static void intFunction() {
        IntFunction<String> toString = Integer::toString;
        System.out.println(toString.apply(973930));
    }

    // IntPredicate
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntPredicate.html
    // Represents a predicate (boolean-valued function) of one int-valued argument.
    static void intPredicate() {
        IntPredicate lessThanThreshold = n -> n > 5;

        System.out.println(lessThanThreshold.test(4));
        System.out.println(lessThanThreshold.test(6));
        System.out.println();
    }

    // IntSupplier
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntSupplier.html
    // Represents a supplier of int-valued results.
    static void intSupplier() {
        Random r = new Random();
        IntSupplier randomDouble = r::nextInt;

        System.out.println(randomDouble.getAsInt());
    }

    // IntToDoubleFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToDoubleFunction.html
    // Represents a function that accepts an int-valued argument and produces a double-valued result.
    static void intToDoubleFunction() {
        IntToDoubleFunction transform = n -> (double) n;
        System.out.println(transform.applyAsDouble(10));
    }

    // IntToLongFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToLongFunction.html
    // Represents a function that accepts an int-valued argument and produces a long-valued result.
    static void intToLongFunction() {
        IntToLongFunction transform = n -> (long) n;
        System.out.println(transform.applyAsLong(10));
    }

    // IntUnaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/IntUnaryOperator.html
    // Represents an operation on a single int-valued operand that produces an int-valued result.
    static void intUnaryOperator() {
        IntUnaryOperator triple = x -> x * x * x;
        System.out.println(triple.applyAsInt(9));
    }

    // LongBinaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongBinaryOperator.html
    // Represents an operation upon two long-valued operands and producing a long-valued result.
    static void longBinaryOperator() {
        LongBinaryOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.applyAsLong(600, 900));
    }

    // LongConsumer
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongConsumer.html
    // Represents an operation that accepts a single long-valued argument and returns no result.
    static void longConsumer() {
        LongConsumer dumpLong = n -> System.out.format("%d\n", n);
        dumpLong.accept((long) 130810238);
    }

    // LongFunction<R>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongFunction.html
    // Represents a function that accepts a long-valued argument and produces a result.
    static void longFunction() {
        LongFunction<String> toString = Long::toString;
        System.out.println(toString.apply(19283475));
    }

    // LongPredicate
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongPredicate.html
    // Represents a predicate (boolean-valued function) of one long-valued argument.
    static void longPredicate() {
        LongPredicate lessThanThreshold = n -> n > 510293845;

        System.out.println(lessThanThreshold.test(510293845));
        System.out.println(lessThanThreshold.test(510293847));
        System.out.println();
    }

    // LongSupplier
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongSupplier.html
    // Represents a supplier of long-valued results.
    static void longSupplier() {
        Random r = new Random();
        LongSupplier randomLong = r::nextLong;

        System.out.println(randomLong.getAsLong());
    }

    // LongToDoubleFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToDoubleFunction.html
    // Represents a function that accepts a long-valued argument and produces a double-valued result.
    static void longToDoubleFunction() {
        LongToDoubleFunction transform = n -> (double) n;
        System.out.println(transform.applyAsDouble(120394586));
    }

    // LongToIntFunction
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToIntFunction.html
    // Represents a function that accepts a long-valued argument and produces an int-valued result.
    static void longToIntFunction() {
        LongToIntFunction transform = n -> (int) n;
        System.out.println(transform.applyAsInt(1029384578));
    }

    // LongUnaryOperator
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/LongUnaryOperator.html
    // Represents an operation on a single long-valued operand that produces a long-valued result.
    static void longUnaryOperator() {
        LongUnaryOperator triple = x -> x * x * x;
        System.out.println(triple.applyAsLong(456789L));
    }

    // ObjDoubleConsumer<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjDoubleConsumer.html
    // Represents an operation that accepts an object-valued and a double-valued argument, and returns no result.
    static void objDoubleConsumer() {
        ObjDoubleConsumer<String> birthRate = (country, amount) -> System.out.format("%s: %.2f", country, amount);
        birthRate.accept("Canada", 1.60);
    }

    // ObjIntConsumer<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjIntConsumer.html
    // Represents an operation that accepts an object-valued and a int-valued argument, and returns no result.
    static void objIntConsumer() {
        ObjIntConsumer<String> population = (country, amount) -> System.out.format("%s: %d", country, amount);
        population.accept("Japan", 126800000);
    }

    // ObjLongConsumer<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjLongConsumer.html
    // Represents an operation that accepts an object-valued and a long-valued argument, and returns no result.
    static void objLongConsumer() {
        ObjLongConsumer<String> population = (country, amount) -> System.out.format("%s: %s", country, amount);
        population.accept("The World", 744200000000L);
    }

    // Predicate<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
    // Represents a predicate (boolean-valued function) of one argument.
    static void predicate() {
        Predicate<Integer> isEvenNumber = n -> n % 2 == 0;
        System.out.println(isEvenNumber.test(9));
    }

    // Supplier<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html
    // Represents a supplier of results.
    static void supplier() {
        Random r = new Random();
        Supplier<String> randomNumberAsString = () -> {
            int n = r.nextInt();
            return Integer.toString(n);
        };
        System.out.println(randomNumberAsString.get());
    }

    // ToDoubleBiFunction<T,U>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleBiFunction.html
    // Represents a function that accepts two arguments and produces a double-valued result.
    static void toDoubleBiFunction() {
        ToDoubleBiFunction<String, String> multiplyString = (a, b) -> Double.valueOf(a) * Double.valueOf(b);
        System.out.println(multiplyString.applyAsDouble("10928345", "19283475843920"));
    }

    // ToDoubleFunction<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleFunction.html
    // Represents a function that produces a double-valued result.
    static void toDoubleFunction() {
        ToDoubleFunction<String> parseDouble = Double::parseDouble;
        System.out.println(parseDouble.applyAsDouble("29384.12345"));
    }

    // ToIntBiFunction<T,U>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntBiFunction.html
    // Represents a function that accepts two arguments and produces an int-valued result.
    static void toIntBiFunction() {
        ToIntBiFunction<String, String> multiplyString = (a, b) -> Integer.valueOf(a) * Integer.valueOf(b);
        System.out.println(multiplyString.applyAsInt("90", "8"));
    }

    // ToIntFunction<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntFunction.html
    // Represents a function that produces an int-valued result.
    static void toIntFunction() {
        ToIntFunction<String> parseInt = Integer::parseInt;
        System.out.println(parseInt.applyAsInt("8972"));
    }

    // ToLongBiFunction<T,U>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongBiFunction.html
    // Represents a function that accepts two arguments and produces a long-valued result.
    static void toLongBiFunction() {
        ToLongBiFunction<String, String> multiplyString = (a, b) -> Long.valueOf(a) * Long.valueOf(b);
        System.out.println(multiplyString.applyAsLong("744200000000", "744200000000"));
    }

    // ToLongFunction<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongFunction.html
    // Represents a function that produces a long-valued result.
    static void toLongFunction() {
        ToLongFunction<String> parseLong = Long::parseLong;
        System.out.println(parseLong.applyAsLong("744200000000"));
    }

    // UnaryOperator<T>
    // https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html
    // Represents an operation on a single operand that produces a result of the same type as its operand.
    static void unaryOperator() {
        UnaryOperator<String> important = message -> message + "!";
        System.out.println(important.apply("Done"));
    }
}
