## Problem 1

The implementation is on [src/app/Counter.java](src/app/Counter.java)

## Problem 2

> Will the following class compile? If not, why?

```
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}
```

### My answer

No, Java throws compile time error because `>`  is not applicable for the type T. We need to use `Comparable` instead since Java doesn't support operator overloading.


## Problem 3

The implementation is on [src/app/Exchange.java](src/app/Exchange.java)


## Problem 4

The implementation is on [src/app/Collection.java](src/app/Collection.java)
