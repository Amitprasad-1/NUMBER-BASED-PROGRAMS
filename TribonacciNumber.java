public class TribonacciNumber {

    public static boolean isTribonacci(int number) {
        int a = 0, b = 1, c = 1, nextTerm = a + b + c;

        while (nextTerm < number) {
            a = b;
            b = c;
            c = nextTerm;
            nextTerm = a + b + c;
        }
        return nextTerm == number;
    }

    public static void main(String[] args) {
        int number = 13;
        if (isTribonacci(number)) {
            System.out.println(number + " is a Tribonacci Number.");
        } else {
            System.out.println(number + " is not a Tribonacci Number.");
        }
    }
}
