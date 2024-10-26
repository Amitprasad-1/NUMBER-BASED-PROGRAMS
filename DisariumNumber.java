public class DisariumNumber {

    public static boolean isDisarium(int number) {
        String strNum = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            sum += Math.pow(digit, i + 1);
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 175;
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }
    }
}
