package assignment7;

public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }

}

// not allow to use > for <T>