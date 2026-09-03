package Arrays;
import java.util.Arrays;

class Generic1Darray<T> {
    private T[] x;

    public Generic1Darray(T... elements) {
        this.x = elements;
    }
    public void reverse1D(int length) {
        int size = x.length;

        if (size - length < length - 1) {
            T temp;
            temp = x[size - length];
            x[size - length] = x[length - 1];
            x[length - 1] = temp;

            reverse1D(length - 1);
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(x);
    }
}

public class Generic1DArrayrecursionDemo {
    public static void main(String[] args) {
        Generic1Darray<Integer> intA = new Generic1Darray<>(1, 2, 3, 4, 5, 6);
        intA.reverse1D(6);

        System.out.println("Reversed Array: " + intA);

        Generic1Darray<String> stringA = new Generic1Darray<>("A", "B", "C", "D", "E");
        stringA.reverse1D(5);
        System.out.println("Reversed Array: " + stringA);
    }
}