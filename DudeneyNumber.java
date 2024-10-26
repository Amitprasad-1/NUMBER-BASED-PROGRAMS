public class DudeneyNumber {

    public static boolean isDudeney(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return Math.cbrt(number) == sum;
    }

    public static void main(String[] args) {
        int number = 512;
        if (isDudeney(number)) {
            System.out.println(number + " is a Dudeney Number.");
        } else {
            System.out.println(number + " is not a Dudeney Number.");
        }
    }
}
