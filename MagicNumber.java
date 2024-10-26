public class MagicNumber {

    public static boolean isMagic(int number) {
        int sum = number;

        while (sum >= 10) {
            sum = sumDigits(sum);
        }

        return sum == 1;
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 19;
        if (isMagic(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }
    }
}
