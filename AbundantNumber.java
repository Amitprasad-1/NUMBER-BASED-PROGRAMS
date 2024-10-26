public class AbundantNumber {

    public static boolean isAbundant(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }

        return sum > number;
    }

    public static void main(String[] args) {
        int number = 18;
        if (isAbundant(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}