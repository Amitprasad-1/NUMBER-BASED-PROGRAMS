public class HarshadMagicNumber {

    public static boolean isHarshad(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return number % sum == 0;
    }

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
        int number = 1729;
        if (isHarshad(number) && isMagic(number)) {
            System.out.println(number + " is a Harshad Magic Number.");
        } else {
            System.out.println(number + " is not a Harshad Magic Number.");
        }
    }
}
