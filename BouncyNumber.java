public class BouncyNumber {

    public static boolean isBouncy(int number) {
        boolean increasing = false, decreasing = false;
        int lastDigit = number % 10;
        number /= 10;

        while (number > 0) {
            int nextDigit = number % 10;
            if (nextDigit < lastDigit) increasing = true;
            if (nextDigit > lastDigit) decreasing = true;
            if (increasing && decreasing) return true;

            lastDigit = nextDigit;
            number /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        int number = 132;
        if (isBouncy(number)) {
            System.out.println(number + " is a Bouncy Number.");
        } else {
            System.out.println(number + " is not a Bouncy Number.");
        }
    }
}
